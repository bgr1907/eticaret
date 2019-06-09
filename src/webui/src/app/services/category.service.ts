import { Injectable } from '@angular/core';
import {Category} from "../layouts/category/category";
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {catchError, tap} from "rxjs/operators";

@Injectable()
export class CategoryService {

  constructor(private http: HttpClient) { }

  path = "http://localhost:8000/category";

  getCategories():Observable<Category[]>{
    return this.http.get<Category[]>(this.path).pipe(
      tap(data=>console.log(JSON.stringify(data))),
      catchError(this.handleError)
    );
  }
  handleError(err: HttpErrorResponse) {
    let errorMessage = '';
    if(err.error instanceof ErrorEvent){
      errorMessage = 'Bir hata oluştu '+err.error.message
    }else{
      errorMessage = 'Sistemsel bir hata'
    }
    return throwError(errorMessage);
  }
}
