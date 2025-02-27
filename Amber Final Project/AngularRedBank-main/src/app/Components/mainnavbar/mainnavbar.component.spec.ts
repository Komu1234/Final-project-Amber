import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MainnavbarComponent } from './mainnavbar.component';

describe('MainnavbarComponent', () => {
  let component: MainnavbarComponent;
  let fixture: ComponentFixture<MainnavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MainnavbarComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MainnavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
