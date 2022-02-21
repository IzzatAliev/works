import {ResponseDto} from "./response-dto";

export interface CourseResponseDto extends ResponseDto {

  courseName: string;
  credit: number;
  courseType: string;
  description: string;
  studentCount: number;
}
