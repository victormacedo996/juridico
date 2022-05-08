import { RegistroAnaliseAtendimentoComponent } from './registro-analise-atendimento.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input'
import {MatButtonModule} from '@angular/material/button'


@NgModule({
  declarations: [RegistroAnaliseAtendimentoComponent],
  imports: [
    CommonModule,
    MatTableModule,
    MatInputModule,
    MatButtonModule
    
  ],
  exports: []
})
export class RegistroAnaliseAtendimentoModule { }
