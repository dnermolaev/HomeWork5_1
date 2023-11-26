interface Attachment {
    val type: AttachmentType
}

interface AttachmentType {
    val id: Int
    val owner_id: Int
    val title: String
    val description : String
}