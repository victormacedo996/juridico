import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistroAnaliseAtendimentoComponent } from './components/atendimento/registro-analise-atendimento/registro-analise-atendimento.component';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';

const routes: Routes = [
  {
    path: 'empresas/listarEmpresas', component: ListarEmpresasComponent
  },
  {
    path: 'atendimento/registrarAnalise', component: RegistroAnaliseAtendimentoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
