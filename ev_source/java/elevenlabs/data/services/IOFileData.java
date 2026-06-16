package io.elevenlabs.data.services;

import io.elevenlabs.domain.model.FileData;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/data/services/IOFileData;", "Lio/elevenlabs/domain/model/FileData;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "fileName", "", "getFileName", "()Ljava/lang/String;", "fileType", "getFileType", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
final class IOFileData implements FileData {
    private final File file;

    public IOFileData(File file) {
        file.getClass();
        this.file = file;
    }

    @Override // io.elevenlabs.domain.model.FileData
    public String getFileName() {
        return this.file.getName();
    }

    @Override // io.elevenlabs.domain.model.FileData
    public String getFileType() {
        String lowerCase = eo.k.i0(this.file).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 3479:
                if (!lowerCase.equals("md")) {
                    return null;
                }
                return "text/markdown";
            case 110834:
                if (lowerCase.equals("pdf")) {
                    return "application/pdf";
                }
                return null;
            case 115312:
                if (lowerCase.equals("txt")) {
                    return "text/plain";
                }
                return null;
            case 3088960:
                if (lowerCase.equals("docx")) {
                    return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
                }
                return null;
            case 3213227:
                if (lowerCase.equals("html")) {
                    return "text/html";
                }
                return null;
            default:
                return null;
        }
    }

    @Override // io.elevenlabs.domain.model.FileData
    public InputStream getInputStream() {
        return new FileInputStream(this.file);
    }
}
