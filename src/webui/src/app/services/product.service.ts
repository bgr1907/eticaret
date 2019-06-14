import {Injectable} from '@angular/core';
import {Product} from "../layouts/product/product";
import {HttpClient, HttpErrorResponse, HttpHeaders, HttpParams} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {catchError, tap} from "rxjs/operators";

@Injectable()
export class ProductService {

  constructor(private http: HttpClient) {
  }

  path = "http://localhost:8000/products";

  getProducts(categoryID): Observable<Product[]> {
    let newPath = this.path;
    if (categoryID) {
      newPath += "/" + categoryID;
    }
    return this.http.get<Product[]>(newPath).pipe(
      tap(data => console.log(JSON.stringify(data))),
      catchError(this.handleError)
    );
  }
  deleteProduct(productID,params: HttpParams = new HttpParams()){
    let newPath = this.path+'/'+productID;
    console.log(newPath);
    return this.http.delete(newPath,{params}).subscribe(()=>
    console.log("denemee"));
  }

  addProduct(product: Product): Observable<Product>{
    const httpOptions = {
      headers:new HttpHeaders({
        'Content-Type':'application/json',
        'Authorization':'Token'
      })
    }
    return this.http.post<Product>(this.path, product, httpOptions).pipe(
      tap(data => console.log(JSON.stringify(data))),
      catchError(this.handleError)
    );
  }

  handleError(err: HttpErrorResponse) {
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {
      errorMessage = 'Bir hata oluştu ' + err.error.message
    } else {
      errorMessage = 'Sistemsel bir hata'
    }
    return throwError(errorMessage);
  }
}
