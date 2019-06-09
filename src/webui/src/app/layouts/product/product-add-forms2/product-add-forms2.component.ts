import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Product} from "../product";
import {Category} from "../../category/category";
import {CategoryService} from "../../../services/category.service";
import {ProductService} from "../../../services/product.service";
import {AlertifyService} from "../../../services/alertify.service";

@Component({
  selector: 'app-product-add-forms2',
  templateUrl: './product-add-forms2.component.html',
  styleUrls: ['./product-add-forms2.component.scss'],
  providers: [CategoryService,ProductService]
})
export class ProductAddForms2Component implements OnInit {

  constructor(private formBuilder: FormBuilder, private categoryService: CategoryService,
              private productService: ProductService, private alertifyService:AlertifyService) {
  }

  productAddForm: FormGroup;
  product: Product = new Product();
  categories: Category[];

  createProductAddForm() {
    this.productAddForm = this.formBuilder.group({
      productName: ["", Validators.required],
      productDescription: ["", Validators.required],
      price: ["", Validators.required],
      categoryID: ["", Validators.required]
    });
  }

  ngOnInit() {
    this.createProductAddForm();
    this.categoryService.getCategories().subscribe(data => {
      this.categories = data
    })
  }

  add() {
    if (this.productAddForm.valid) {
      this.product = Object.assign({}, this.productAddForm.value)
    }
    this.productService.addProduct(this.product).subscribe(data => {
      this.alertifyService.success(data.productName+ " başarıyla eklendi.")
    });
  }
}
