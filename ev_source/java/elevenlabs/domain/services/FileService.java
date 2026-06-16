package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.FileData;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/FileService;", "", "getCacheDirectory", "Ljava/io/File;", "loadFileFromContentResolver", "Lio/elevenlabs/domain/model/FileData;", "uri", "", "loadFileFromFileSystem", "file", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface FileService {
    File getCacheDirectory();

    FileData loadFileFromContentResolver(String uri);

    FileData loadFileFromFileSystem(File file);
}
