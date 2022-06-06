import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgModel } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgSelectModule } from '@ng-select/ng-select';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatFormFieldModule } from '@angular/material/form-field';
import { SweetAlert2Module } from '@sweetalert2/ngx-sweetalert2';

import { ListarEmpresasComponent } from './components/empresa/listar-empresas/listar-empresas.component';
import { AdicionarEmpresaComponent } from './components/empresa/adicionar-empresa/adicionar-empresa.component';
import { AtualizarEmpresaComponent } from './components/empresa/atualizar-empresa/atualizar-empresa.component';
import { ApagarEmpresaComponent } from './components/empresa/apagar-empresa/apagar-empresa.component';

import { RegistrarSolicitacaoAnaliseJuridicoComponent } from './components/solicitacao-analise-juridico/registrar-solicitacao-analise-juridico/registrar-solicitacao-analise-juridico.component';
import { ConsultarSolicitacaoAnaliseJuridicoComponent } from './components/solicitacao-analise-juridico/consultar-solicitacao-analise-juridico/consultar-solicitacao-analise-juridico.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarEmpresasComponent,
    AdicionarEmpresaComponent,
    AtualizarEmpresaComponent,
    ApagarEmpresaComponent,
    RegistrarSolicitacaoAnaliseJuridicoComponent,
    ConsultarSolicitacaoAnaliseJuridicoComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgSelectModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    MatSelectModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    SweetAlert2Module
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
