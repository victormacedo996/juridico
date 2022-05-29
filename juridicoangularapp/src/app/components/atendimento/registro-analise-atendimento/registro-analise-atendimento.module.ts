import { RegistroAnaliseAtendimentoComponent } from './registro-analise-atendimento.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field'
import {MatButtonModule} from '@angular/material/button';
import {ReactiveFormsModule} from '@angular/forms';
import {MatDialogModule} from '@angular/material/dialog'


@NgModule({
  declarations: [RegistroAnaliseAtendimentoComponent],
  imports: [
    CommonModule,
    MatTableModule,
    MatInputModule,
    MatButtonModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatDialogModule

    
  ],
  exports: [RegistroAnaliseAtendimentoComponent]
})
export class RegistroAnaliseAtendimentoModule { }
