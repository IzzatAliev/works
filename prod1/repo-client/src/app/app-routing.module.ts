import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'courses',
    pathMatch: 'full'
  },
  {
    path: 'courses',
    pathMatch: 'prefix',
    loadChildren: () => import('./pages/course/course.module').then(m => m.CourseModule)
  },
  {
    path: 'students',
    pathMatch: 'prefix',
    loadChildren: () => import('./pages/student/student.module').then(m => m.StudentModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
