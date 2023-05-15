fun isDirectoryPath( // 유틸 함수를 만들 때
    path: String
) : Boolean {
    return path.endsWith("/")
}