function obtenerDiaSemana(dia) {
  const dias = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"];
  return dias[dia];
}

const diaDeLaSemana = new Date().getDay(); 
console.log(obtenerDiaSemana(diaDeLaSemana)); 
