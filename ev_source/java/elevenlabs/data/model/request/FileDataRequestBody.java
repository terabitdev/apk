package io.elevenlabs.data.model.request;

import com.google.protobuf.c6;
import fs.b;
import fs.i;
import fs.w;
import io.elevenlabs.domain.model.FileData;
import java.io.InputStream;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import wq.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/data/model/request/FileDataRequestBody;", "Lokhttp3/RequestBody;", "Lio/elevenlabs/domain/model/FileData;", "fileData", "<init>", "(Lio/elevenlabs/domain/model/FileData;)V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "Lfs/i;", "sink", "Lsn/z;", "writeTo", "(Lfs/i;)V", "Lio/elevenlabs/domain/model/FileData;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FileDataRequestBody extends RequestBody {
    private final FileData fileData;

    public FileDataRequestBody(FileData fileData) {
        fileData.getClass();
        this.fileData = fileData;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getF25334c() {
        String fileType = this.fileData.getFileType();
        if (fileType != null) {
            l lVar = MediaType.f25321e;
            try {
                return MediaType.Companion.a(fileType);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(i sink) {
        sink.getClass();
        InputStream inputStream = this.fileData.getInputStream();
        if (inputStream != null) {
            w i10 = b.i(inputStream);
            try {
                sink.m(i10);
                i10.close();
            } finally {
            }
        } else {
            c6.z("Couldn't open content URI for reading");
        }
    }
}
