package io.elevenlabs.data.services.optimized;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import eo.k;
import io.elevenlabs.domain.services.FileService;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import qr.h;
import wq.n;
import yr.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006!"}, d2 = {"Lio/elevenlabs/data/services/optimized/OptimizedReadCache;", "", "Lio/elevenlabs/domain/services/FileService;", "fileService", "<init>", "(Lio/elevenlabs/domain/services/FileService;)V", "", "chapterIndex", "", "chapterFileName", "(I)Ljava/lang/String;", "readId", "checksum", "Ljava/io/File;", "dirFor", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", FirebaseAnalytics.Param.INDEX, "Lsn/z;", "writeIndex", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;)V", "readIndex", "(Ljava/lang/String;Ljava/lang/String;)Lio/elevenlabs/data/services/optimized/OptimizedReadIndexBlob;", "Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", "chapter", "writeChapter", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/services/optimized/ChapterContentBlob;)V", "readChapter", "(Ljava/lang/String;Ljava/lang/String;I)Lio/elevenlabs/data/services/optimized/ChapterContentBlob;", SDPKeywords.CLEAR, "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/elevenlabs/domain/services/FileService;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OptimizedReadCache {
    private static final String INDEX_FILE = "index.bin";
    private static final String ROOT = "optimized-reads";
    private static final int VERSION = 5;
    private final FileService fileService;

    public OptimizedReadCache(FileService fileService) {
        fileService.getClass();
        this.fileService = fileService;
    }

    private final String chapterFileName(int chapterIndex) {
        return b.j(chapterIndex, "chapter_", ".bin");
    }

    public final void clear(String readId, String checksum) {
        readId.getClass();
        try {
            k.h0(dirFor(readId, checksum));
        } catch (Throwable unused) {
        }
    }

    public final File dirFor(String readId, String checksum) {
        String str;
        readId.getClass();
        if (checksum != null && !n.m0(checksum)) {
            str = f.i("-", checksum);
        } else {
            str = "";
        }
        return new File(this.fileService.getCacheDirectory(), f.k("optimized-reads/", readId, str, "-v5"));
    }

    public final ChapterContentBlob readChapter(String readId, String checksum, int chapterIndex) {
        readId.getClass();
        File file = new File(dirFor(readId, checksum), chapterFileName(chapterIndex));
        if (file.exists() && !file.isDirectory()) {
            try {
                a aVar = a.f38768b;
                byte[] j02 = k.j0(file);
                aVar.getClass();
                return (ChapterContentBlob) aVar.a(ChapterContentBlob.INSTANCE.serializer(), j02);
            } catch (FileNotFoundException | h unused) {
            }
        }
        return null;
    }

    public final OptimizedReadIndexBlob readIndex(String readId, String checksum) {
        readId.getClass();
        File file = new File(dirFor(readId, checksum), INDEX_FILE);
        if (file.exists() && !file.isDirectory()) {
            try {
                a aVar = a.f38768b;
                byte[] j02 = k.j0(file);
                aVar.getClass();
                return (OptimizedReadIndexBlob) aVar.a(OptimizedReadIndexBlob.INSTANCE.serializer(), j02);
            } catch (FileNotFoundException | h unused) {
            }
        }
        return null;
    }

    public final void writeChapter(String readId, String checksum, ChapterContentBlob chapter) {
        readId.getClass();
        chapter.getClass();
        File dirFor = dirFor(readId, checksum);
        dirFor.mkdirs();
        File file = new File(dirFor, chapterFileName(chapter.getChapterIndex()));
        a aVar = a.f38768b;
        aVar.getClass();
        k.m0(file, aVar.b(ChapterContentBlob.INSTANCE.serializer(), chapter));
    }

    public final void writeIndex(String readId, String checksum, OptimizedReadIndexBlob index) {
        readId.getClass();
        index.getClass();
        File dirFor = dirFor(readId, checksum);
        dirFor.mkdirs();
        File file = new File(dirFor, INDEX_FILE);
        a aVar = a.f38768b;
        aVar.getClass();
        k.m0(file, aVar.b(OptimizedReadIndexBlob.INSTANCE.serializer(), index));
    }
}
