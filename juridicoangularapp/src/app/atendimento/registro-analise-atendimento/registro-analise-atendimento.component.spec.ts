import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistroAnaliseAtendimentoComponent } from './registro-analise-atendimento.component';

describe('RegistroAnaliseAtendimentoComponent', () => {
  let component: RegistroAnaliseAtendimentoComponent;
  let fixture: ComponentFixture<RegistroAnaliseAtendimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistroAnaliseAtendimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistroAnaliseAtendimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
