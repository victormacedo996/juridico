import { CUSTOM_ELEMENTS_SCHEMA, NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';
import { AdicionarEmpresaComponent } from './components/Empresa/adicionar-empresa/adicionar-empresa.component';
import { AtualizarEmpresaComponent } from './components/Empresa/atualizar-empresa/atualizar-empresa.component';
import { ApagarEmpresaComponent } from './components/Empresa/apagar-empresa/apagar-empresa.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RegistroAnaliseAtendimentoModule } from './components/atendimento/registro-analise-atendimento/registro-analise-atendimento.module';
import { ConfirmacaoRegistroAnaliseModule } from './components/atendimento/confirmacao-registro-analise/confirmacao-registro-analise.module';
@NgModule({
  declarations: [
    AppComponent,
    ListarEmpresasComponent,
    AdicionarEmpresaComponent,
    AtualizarEmpresaComponent,
    ApagarEmpresaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RegistroAnaliseAtendimentoModule,
    BrowserAnimationsModule,
    ConfirmacaoRegistroAnaliseModule
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA , NO_ERRORS_SCHEMA],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
