package io.elevenlabs.data.worker;

import android.content.Context;
import android.gov.nist.core.Separators;
import defpackage.f;
import ho.l;
import ir.i;
import ir.m1;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aS\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u001e\b\u0002\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroid/content/Context;", "", "readId", "voiceId", "Ljava/io/File;", "getReadDownloadDir", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "getDownloadsDirForRead", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getBaseDownloadsDir", "(Landroid/content/Context;)Ljava/io/File;", "Lokhttp3/ResponseBody;", "", "bufferSize", "Lir/i;", "Lsn/k;", "", "", "toProgressFlow", "(Lokhttp3/ResponseBody;I)Lir/i;", "file", "Lkotlin/Function1;", "Lwn/c;", "Lsn/z;", "", "onCancel", "writeToFile", "(Lir/i;Ljava/io/File;Lho/l;)Lir/i;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloaderKt {
    public static final File getBaseDownloadsDir(Context context) {
        context.getClass();
        return new File(context.getFilesDir(), "audiodata-v1");
    }

    public static final File getDownloadsDirForRead(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getFilesDir(), "audiodata-v1/".concat(str));
    }

    public static final File getReadDownloadDir(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        return new File(context.getFilesDir(), f.k("audiodata-v1/", str, Separators.SLASH, str2));
    }

    private static final i toProgressFlow(ResponseBody responseBody, int i10) {
        return new m1(new OfflineReadsDownloaderKt$toProgressFlow$1(responseBody, i10, null));
    }

    public static /* synthetic */ i toProgressFlow$default(ResponseBody responseBody, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 4096;
        }
        return toProgressFlow(responseBody, i10);
    }

    public static final i writeToFile(i iVar, File file, l lVar) {
        return new m1(new OfflineReadsDownloaderKt$writeToFile$2(file, iVar, lVar, null));
    }

    public static /* synthetic */ i writeToFile$default(i iVar, File file, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new OfflineReadsDownloaderKt$writeToFile$1(null);
        }
        return writeToFile(iVar, file, lVar);
    }
}
