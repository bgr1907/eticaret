import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {IndexComponent} from './index/index.component';
import {IndexModule} from "./index/index.module";
import {ProductComponent} from './layouts/product/product.component';
import {ProductFilterPipe} from './layouts/product/product-filter.pipe';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AlertifyService} from "./services/alertify.service";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {CategoryComponent} from './layouts/category/category.component';
import {ProductAddForms1Component} from './layouts/product/product-add-forms1/product-add-forms1.component';
import {ProductAddForms2Component} from './layouts/product/product-add-forms2/product-add-forms2.component';
import {LoginComponent} from './login/login.component';
import {AuthenticationService} from "./security/authentication.service";
import {RegisterComponent} from './register/register.component';
import {JwtInterceptor} from "./security/jwt.interceptor";
import {AuthGuard} from "./security/auth.guard";
import {ErrorInterceptor} from "./security/authentication.interceptor";


@NgModule({
  declarations: [
    AppComponent,
    IndexComponent,
    ProductComponent,
    ProductFilterPipe,
    CategoryComponent,
    ProductAddForms1Component,
    ProductAddForms2Component,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    IndexModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [AlertifyService,
    AuthGuard,
    AuthenticationService,
    {provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true},
    {provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
