import { UsuarioComponent } from './components/usuario/usuario.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';
import { ConsultarComponent } from './components/consultar-solicitacoes/consultar.component'

const routes: Routes = [
  {
    path: 'empresas', component: ListarEmpresasComponent
  },
  {
    path: 'usuarios', component: UsuarioComponent
  },
  {
    path: '', component: ConsultarComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
