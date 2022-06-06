import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListarEmpresasComponent } from './components/empresa/listar-empresas/listar-empresas.component';
import { AdicionarEmpresaComponent } from './components/empresa/adicionar-empresa/adicionar-empresa.component';
import { AtualizarEmpresaComponent } from './components/empresa/atualizar-empresa/atualizar-empresa.component';
import { ApagarEmpresaComponent } from './components/empresa/apagar-empresa/apagar-empresa.component';

import { RegistrarSolicitacaoAnaliseJuridicoComponent } from './components/solicitacao-analise-juridico/registrar-solicitacao-analise-juridico/registrar-solicitacao-analise-juridico.component';
import { ConsultarSolicitacaoAnaliseJuridicoComponent } from './components/solicitacao-analise-juridico/consultar-solicitacao-analise-juridico/consultar-solicitacao-analise-juridico.component';

const routes: Routes = [
  {
    path: 'empresas/listar', component: ListarEmpresasComponent
  },
  {
    path: 'empresas/adicionar', component: AdicionarEmpresaComponent
  },
  {
    path: 'empresas/atualizar', component: AtualizarEmpresaComponent
  },
  {
    path: 'empresas/apagar', component: ApagarEmpresaComponent
  },      
  {
    path: 'solicitacaoAnaliseJuridico/registrar', component: RegistrarSolicitacaoAnaliseJuridicoComponent
  },
  {
    path: 'solicitacaoAnaliseJuridico/consultar', component: ConsultarSolicitacaoAnaliseJuridicoComponent
  }  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
