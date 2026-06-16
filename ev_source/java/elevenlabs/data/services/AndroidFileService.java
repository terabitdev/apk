package io.elevenlabs.data.services;

import android.content.Context;
import android.net.Uri;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.FileData;
import io.elevenlabs.domain.services.FileService;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/data/services/AndroidFileService;", "Lio/elevenlabs/domain/services/FileService;", "context", "Landroid/content/Context;", "logger", "Lio/elevenlabs/domain/Logger;", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/Logger;)V", "getCacheDirectory", "Ljava/io/File;", "loadFileFromContentResolver", "Lio/elevenlabs/domain/model/FileData;", "uri", "", "loadFileFromFileSystem", "file", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AndroidFileService implements FileService {
    private final Context context;
    private final Logger logger;

    public AndroidFileService(Context context, Logger logger) {
        context.getClass();
        logger.getClass();
        this.context = context;
        this.logger = logger;
    }

    @Override // io.elevenlabs.domain.services.FileService
    public File getCacheDirectory() {
        File cacheDir = this.context.getCacheDir();
        cacheDir.getClass();
        return cacheDir;
    }

    @Override // io.elevenlabs.domain.services.FileService
    public FileData loadFileFromContentResolver(String uri) {
        uri.getClass();
        return new ContentResolverFileData(this.context, Uri.parse(uri), this.logger);
    }

    @Override // io.elevenlabs.domain.services.FileService
    public FileData loadFileFromFileSystem(File file) {
        file.getClass();
        return new IOFileData(file);
    }
}
