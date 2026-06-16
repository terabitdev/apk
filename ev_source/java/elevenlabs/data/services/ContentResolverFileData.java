package io.elevenlabs.data.services;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.FileData;
import java.io.InputStream;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lio/elevenlabs/data/services/ContentResolverFileData;", "Lio/elevenlabs/domain/model/FileData;", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Landroid/net/Uri;Lio/elevenlabs/domain/Logger;)V", "Landroid/content/Context;", "Landroid/net/Uri;", "Lio/elevenlabs/domain/Logger;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "", "fileUri$delegate", "Lsn/h;", "getFileUri", "()Ljava/lang/String;", "fileUri", "fileName$delegate", "getFileName", "fileName", "fileType$delegate", "getFileType", "fileType", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "inputStream", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ContentResolverFileData implements FileData {
    private static final String TAG = "ContentResolverFileData";
    private final ContentResolver contentResolver;
    private final Context context;

    /* renamed from: fileName$delegate, reason: from kotlin metadata */
    private final sn.h fileName;

    /* renamed from: fileType$delegate, reason: from kotlin metadata */
    private final sn.h fileType;

    /* renamed from: fileUri$delegate, reason: from kotlin metadata */
    private final sn.h fileUri;
    private final Logger logger;
    private final Uri uri;

    public ContentResolverFileData(Context context, Uri uri, Logger logger) {
        context.getClass();
        uri.getClass();
        logger.getClass();
        this.context = context;
        this.uri = uri;
        this.logger = logger;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        this.contentResolver = contentResolver;
        final int i10 = 0;
        this.fileUri = new o(new ho.a(this) { // from class: io.elevenlabs.data.services.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentResolverFileData f14116b;

            {
                this.f14116b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                String fileUri_delegate$lambda$0;
                String fileName_delegate$lambda$0;
                String fileType_delegate$lambda$0;
                switch (i10) {
                    case 0:
                        fileUri_delegate$lambda$0 = ContentResolverFileData.fileUri_delegate$lambda$0(this.f14116b);
                        return fileUri_delegate$lambda$0;
                    case 1:
                        fileName_delegate$lambda$0 = ContentResolverFileData.fileName_delegate$lambda$0(this.f14116b);
                        return fileName_delegate$lambda$0;
                    default:
                        fileType_delegate$lambda$0 = ContentResolverFileData.fileType_delegate$lambda$0(this.f14116b);
                        return fileType_delegate$lambda$0;
                }
            }
        });
        final int i11 = 1;
        this.fileName = new o(new ho.a(this) { // from class: io.elevenlabs.data.services.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentResolverFileData f14116b;

            {
                this.f14116b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                String fileUri_delegate$lambda$0;
                String fileName_delegate$lambda$0;
                String fileType_delegate$lambda$0;
                switch (i11) {
                    case 0:
                        fileUri_delegate$lambda$0 = ContentResolverFileData.fileUri_delegate$lambda$0(this.f14116b);
                        return fileUri_delegate$lambda$0;
                    case 1:
                        fileName_delegate$lambda$0 = ContentResolverFileData.fileName_delegate$lambda$0(this.f14116b);
                        return fileName_delegate$lambda$0;
                    default:
                        fileType_delegate$lambda$0 = ContentResolverFileData.fileType_delegate$lambda$0(this.f14116b);
                        return fileType_delegate$lambda$0;
                }
            }
        });
        final int i12 = 2;
        this.fileType = new o(new ho.a(this) { // from class: io.elevenlabs.data.services.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContentResolverFileData f14116b;

            {
                this.f14116b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                String fileUri_delegate$lambda$0;
                String fileName_delegate$lambda$0;
                String fileType_delegate$lambda$0;
                switch (i12) {
                    case 0:
                        fileUri_delegate$lambda$0 = ContentResolverFileData.fileUri_delegate$lambda$0(this.f14116b);
                        return fileUri_delegate$lambda$0;
                    case 1:
                        fileName_delegate$lambda$0 = ContentResolverFileData.fileName_delegate$lambda$0(this.f14116b);
                        return fileName_delegate$lambda$0;
                    default:
                        fileType_delegate$lambda$0 = ContentResolverFileData.fileType_delegate$lambda$0(this.f14116b);
                        return fileType_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fileName_delegate$lambda$0(ContentResolverFileData contentResolverFileData) {
        Cursor query = contentResolverFileData.contentResolver.query(Uri.parse(contentResolverFileData.getFileUri()), null, null, null, null);
        if (query == null) {
            contentResolverFileData.logger.logError(TAG, defpackage.f.k("cursor is null - fileName=", contentResolverFileData.getFileName(), "; permissions: ", AndroidFileServiceKt.access$getGrantedPermissionsForQuery(contentResolverFileData.context, Uri.parse(contentResolverFileData.getFileUri()))), null);
        }
        if (query != null && query.moveToFirst()) {
            String string = query.getString(query.getColumnIndex("_display_name"));
            query.close();
            return string;
        }
        if (query != null) {
            query.close();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fileType_delegate$lambda$0(ContentResolverFileData contentResolverFileData) {
        return contentResolverFileData.contentResolver.getType(contentResolverFileData.uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fileUri_delegate$lambda$0(ContentResolverFileData contentResolverFileData) {
        return contentResolverFileData.uri.toString();
    }

    private final String getFileUri() {
        Object value = this.fileUri.getValue();
        value.getClass();
        return (String) value;
    }

    @Override // io.elevenlabs.domain.model.FileData
    public String getFileName() {
        return (String) this.fileName.getValue();
    }

    @Override // io.elevenlabs.domain.model.FileData
    public String getFileType() {
        return (String) this.fileType.getValue();
    }

    @Override // io.elevenlabs.domain.model.FileData
    public InputStream getInputStream() {
        return this.contentResolver.openInputStream(this.uri);
    }
}
