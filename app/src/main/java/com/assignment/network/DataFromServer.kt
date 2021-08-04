import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DataFromServer (

	@SerializedName("logo-url")
	val logourl : String,
	@SerializedName("heading-text")
	val headingtext : String,
	@SerializedName("uidata")
	val uidata : List<Uidata>
)