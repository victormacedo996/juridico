import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarEmpresasComponent } from './components/Empresa/listar-empresas/listar-empresas.component';
import { AdicionarEmpresaComponent } from './components/Empresa/adicionar-empresa/adicionar-empresa.component';
import { AtualizarEmpresaComponent } from './components/Empresa/atualizar-empresa/atualizar-empresa.component';
import { ApagarEmpresaComponent } from './components/Empresa/apagar-empresa/apagar-empresa.component';
import { ConsultarComponent } from './components/consultar-solicitacoes/consultar.component';
import { FormsModule } from '@angular/forms';
import { CabecalhoComponent } from './components/cabecalho/cabecalho.component';
import { RodapeComponent } from './components/rodape/rodape.component';

import {MatIconModule} from '@angular/material/icon';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from '@angular/material/table';

@NgModule({
  declarations: [
    AppComponent,
    ListarEmpresasComponent,
    AdicionarEmpresaComponent,
    AtualizarEmpresaComponent,
    ApagarEmpresaComponent,
    ConsultarComponent,
    CabecalhoComponent,
    RodapeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatIconModule,
    BrowserAnimationsModule,
    MatTableModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
