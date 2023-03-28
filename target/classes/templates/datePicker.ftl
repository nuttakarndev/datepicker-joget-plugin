<div class="form-cell" ${elementMetaData!}>
    <link rel="stylesheet" href="${request.contextPath}/plugin/org.joget.DatePicker/datepicker.css"/>
    <script type="text/javascript" src="${request.contextPath}/plugin/org.joget.DatePicker/datepicker.js"></script>
    <label class="label">${element.properties.label}</label>
    <input id="${elementParamName!}" name="${elementParamName!}" data-toggle="datepicker" class="form-cell-value"
           value="${value!?html}"/>
    <script>
        $('[data-toggle="datepicker"]').datepicker();
    </script>
</div>