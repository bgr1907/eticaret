import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {IndexComponent} from "./index/index.component";
import {ProductComponent} from "./layouts/product/product.component";
import {ProductAddForms1Component} from "./layouts/product/product-add-forms1/product-add-forms1.component";
import {ProductAddForms2Component} from "./layouts/product/product-add-forms2/product-add-forms2.component";
import {LoginComponent} from "./login/login.component";
import {AuthGuard} from "./security/auth.guard";
import {RegisterComponent} from "./register/register.component";


const routes: Routes = [
  {path: 'index', component: IndexComponent},
  {path: 'products', component: ProductComponent},
  {path: 'product-add-1', component: ProductAddForms1Component, canActivate: [AuthGuard]},
  {path: 'product-add-2', component: ProductAddForms2Component, canActivate: [AuthGuard]},
  {path: '', redirectTo: 'products', pathMatch: 'full'},
  {path: 'products/category/:categoryID', component: ProductComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
