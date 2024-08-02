// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();

  let listadoHtml ='';

    for (let usuario of usuarios){
        let usuarioHTML = ' <tr>\n' +
            '                                            <td>123</td>\n' +
            '                                            <td>'+usuario.nombre+'</td>\n' +
            '                                           <td>'+usuario.apellido+'</td>\n'+
            '                                            <td>'+usuario.mail+'</td>\n' +
            '                                            <td>'+usuario.telefono+'</td>\n' +
            '                                            <td>\n' +
            '                                                <a href="#" class="btn btn-danger btn-circle btn-sm">\n' +
            '                                                    <i class="fas fa-trash"></i>\n' +
            '                                                </a>\n' +
            '                                            </td>\n' +
            '                                        </tr>'

      listadoHtml+=usuarioHTML;

    }



  document.querySelector('#usuarios tbody').outerHTML =listadoHtml

}
