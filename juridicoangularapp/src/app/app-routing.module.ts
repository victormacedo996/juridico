import { RequisicaoComponent } from './components/requisicao/requisicao.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';
import { ConsultarComponent } from './components/consultar-solicitacoes/consultar.component';
import { SolicitacaoAnaliseJuridicoComponent } from './components/Solicitacao-Analise-Juridico/solicitacao-analise-juridico.component';
import { EsculapioComponent } from './components/esculapio/esculapio.component';

const routes: Routes = [
  {
    path: 'empresas/listarEmpresas', component: ListarEmpresasComponent
  },
  {
    path: 'solicitacaoAnaliseJuridico', component: SolicitacaoAnaliseJuridicoComponent
  },
  {
    path: 'esculapio', component: EsculapioComponent
  },
  {
     path: '', component: ConsultarComponent
    , pathMatch: 'full' },
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
