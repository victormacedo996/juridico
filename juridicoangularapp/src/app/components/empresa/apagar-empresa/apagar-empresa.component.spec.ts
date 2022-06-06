import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApagarEmpresaComponent } from './apagar-empresa.component';

describe('ApagarEmpresaComponent', () => {
  let component: ApagarEmpresaComponent;
  let fixture: ComponentFixture<ApagarEmpresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApagarEmpresaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApagarEmpresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
