import { RequisicaoComponent } from './components/requisicao/requisicao.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';

const routes: Routes = [
  {
    path: 'empresas/listarEmpresas', component: ListarEmpresasComponent
  },
  {
    path: 'requisicao', component: RequisicaoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
