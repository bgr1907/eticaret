import {Component, OnInit} from '@angular/core';
import {Product} from "./product";
import {AlertifyService} from "../../services/alertify.service";
import {ProductService} from "../../services/product.service";
import {ActivatedRoute, Router} from "@angular/router";


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss'],
  providers: [ProductService]
})
export class ProductComponent implements OnInit {

  constructor(
    private alertifyService: AlertifyService,
    private productService: ProductService,
    private activatedRoute: ActivatedRoute,
    private router:Router
    ) {
  }

  title = "Ürün Listesi";
  filterText = "";
  products: Product[];
  activeUser:{};
  show:boolean=false;
  ngOnInit() {
    this.activatedRoute.params.subscribe(params=>{
      this.productService.getProducts(params["categoryID"]).subscribe(data=>{
        this.products = data
      });
    });
    this.activeUser= JSON.parse(localStorage.getItem('currentUser'));
    for (var i in this.activeUser){
      if(i==="role"){
        if(this.activeUser[i]==="ADMIN"){
          this.show=true;
        }
      }
    }
    console.log(this.show)
  }

  addToCart(product) {
    this.alertifyService.success(product.productName + " added")
  }
  deleteToProduct(productId){
    console.log("Çalıştı")
    this.productService.deleteProduct(productId);
    this.router.navigateByUrl('/products', {skipLocationChange: true}).then(()=>
      this.router.navigate(["Your actualComponent"]));
  }

}
