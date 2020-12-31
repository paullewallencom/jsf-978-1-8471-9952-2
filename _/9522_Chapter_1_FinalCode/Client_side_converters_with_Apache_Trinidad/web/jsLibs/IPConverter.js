function ipGetAsString(value, label)
{
  return value.substring(0,3) + '.' + value.substring(3,6) + '.' + value.substring(6,9) + '.' + value.substring(9,12);
}

function ipGetAsObject(value, label)
{ 
  if (!value)return null;
  var len=value.length;

  var messageKey = IPConverter.NOT;
  if (len < 12 )
    messageKey = IPConverter.SHORT;
  else if (len > 15)
    messageKey = IPConverter.LONG;
  else if ((len == 12)||(len == 15))
  { 
      return value;
  }
  
  if (messageKey!=null && this._messages!=null)
  { 
    // format the detail error string
    var detail = this._messages[messageKey];
    if (detail != null)
    {
      detail = TrFastMessageFormatUtils.format(detail, label, value);
    }
  
    var facesMessage = new TrFacesMessage(
                        this._messages[IPConverter.SUMMARY],
                        detail,
                        TrFacesMessage.SEVERITY_ERROR)
   throw new TrConverterException(facesMessage);
 }
 return null;
}

function IPConverter(messages) {
	this._messages = messages;
}
IPConverter.prototype = new TrConverter();
IPConverter.prototype.getAsString = ipGetAsString;
IPConverter.prototype.getAsObject = ipGetAsObject;
IPConverter.SUMMARY = 'SUM';
IPConverter.SHORT = 'S';
IPConverter.LONG = 'L';
IPConverter.NOT = 'N';