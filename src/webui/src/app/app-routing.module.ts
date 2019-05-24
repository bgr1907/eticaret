import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {IndexComponent} from "./index/index.component";

const routes: Routes = [
  {
    path: '', component: IndexComponent,
    children: [
      {path: '', pathMatch: 'full', redirectTo: '/index'},
      {path: 'index', loadChildren: './index/index.module#IndexModule'}
      ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
