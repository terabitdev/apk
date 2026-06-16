package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/model/FileDownloadState;", "", "<init>", "()V", "Downloading", "Finished", "Lio/elevenlabs/domain/model/FileDownloadState$Downloading;", "Lio/elevenlabs/domain/model/FileDownloadState$Finished;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class FileDownloadState {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/FileDownloadState$Downloading;", "Lio/elevenlabs/domain/model/FileDownloadState;", "progress", "", "<init>", "(I)V", "getProgress", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Downloading extends FileDownloadState {
        private final int progress;

        public Downloading(int i10) {
            super(null);
            this.progress = i10;
        }

        public static /* synthetic */ Downloading copy$default(Downloading downloading, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = downloading.progress;
            }
            return downloading.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        public final Downloading copy(int progress) {
            return new Downloading(progress);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Downloading) && this.progress == ((Downloading) other).progress) {
                return true;
            }
            return false;
        }

        public final int getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return Integer.hashCode(this.progress);
        }

        public String toString() {
            return b.j(this.progress, "Downloading(progress=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/FileDownloadState$Finished;", "Lio/elevenlabs/domain/model/FileDownloadState;", "file", "Ljava/io/File;", "headers", "", "", "<init>", "(Ljava/io/File;Ljava/util/Map;)V", "getFile", "()Ljava/io/File;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Finished extends FileDownloadState {
        private final File file;
        private final Map<String, String> headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(File file, Map<String, String> map) {
            super(null);
            file.getClass();
            map.getClass();
            this.file = file;
            this.headers = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Finished copy$default(Finished finished, File file, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                file = finished.file;
            }
            if ((i10 & 2) != 0) {
                map = finished.headers;
            }
            return finished.copy(file, map);
        }

        /* renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public final Map<String, String> component2() {
            return this.headers;
        }

        public final Finished copy(File file, Map<String, String> headers) {
            file.getClass();
            headers.getClass();
            return new Finished(file, headers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) other;
            if (m.c(this.file, finished.file) && m.c(this.headers, finished.headers)) {
                return true;
            }
            return false;
        }

        public final File getFile() {
            return this.file;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            return this.headers.hashCode() + (this.file.hashCode() * 31);
        }

        public String toString() {
            return "Finished(file=" + this.file + ", headers=" + this.headers + Separators.RPAREN;
        }
    }

    public /* synthetic */ FileDownloadState(f fVar) {
        this();
    }

    private FileDownloadState() {
    }
}
