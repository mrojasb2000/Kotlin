package hello

import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Duplicate item.")
class DuplicateItemException: RuntimeException() {}