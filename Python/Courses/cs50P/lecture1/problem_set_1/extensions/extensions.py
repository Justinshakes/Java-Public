fileName = input("File name: ")

if "." in fileName:
    words = fileName.split('.')
    fileType = words[-1].lower().strip()
    # [-1] = last word in array

    match fileType:
        case "gif" | "png":
            print("image/" + fileType)
        case "jpg" | "jpeg":
            print("image/jpeg")
        case "pdf":
            print("application/pdf")
        case "txt":
            print("text/plain")
        case "zip":
            print("application/zip")
        case _:
            print("application/octet-stream")
else:
    print("application/octet-stream")
