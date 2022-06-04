import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EsculapioComponent } from './esculapio.component';

describe('EsculapioComponent', () => {
  let component: EsculapioComponent;
  let fixture: ComponentFixture<EsculapioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EsculapioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EsculapioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
