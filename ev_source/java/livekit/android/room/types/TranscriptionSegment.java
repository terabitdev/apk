package io.livekit.android.room.types;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import ib.i;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lio/livekit/android/room/types/TranscriptionSegment;", "", "id", "", ParameterNames.TEXT, "language", "final", "", "firstReceivedTime", "", "lastReceivedTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJ)V", "getFinal", "()Z", "getFirstReceivedTime", "()J", "getId", "()Ljava/lang/String;", "getLanguage", "getLastReceivedTime", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class TranscriptionSegment {
    private final boolean final;
    private final long firstReceivedTime;
    private final String id;
    private final String language;
    private final long lastReceivedTime;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TranscriptionSegment(String str, String str2, String str3, boolean z6, long j4, long j10, int i10, f fVar) {
        this(str, str2, str3, z6, r7, r9);
        long j11;
        long j12;
        if ((i10 & 16) != 0) {
            j11 = new Date().getTime();
        } else {
            j11 = j4;
        }
        if ((i10 & 32) != 0) {
            j12 = new Date().getTime();
        } else {
            j12 = j10;
        }
    }

    public static /* synthetic */ TranscriptionSegment copy$default(TranscriptionSegment transcriptionSegment, String str, String str2, String str3, boolean z6, long j4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transcriptionSegment.id;
        }
        if ((i10 & 2) != 0) {
            str2 = transcriptionSegment.text;
        }
        if ((i10 & 4) != 0) {
            str3 = transcriptionSegment.language;
        }
        if ((i10 & 8) != 0) {
            z6 = transcriptionSegment.final;
        }
        if ((i10 & 16) != 0) {
            j4 = transcriptionSegment.firstReceivedTime;
        }
        if ((i10 & 32) != 0) {
            j10 = transcriptionSegment.lastReceivedTime;
        }
        long j11 = j10;
        long j12 = j4;
        return transcriptionSegment.copy(str, str2, str3, z6, j12, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFinal() {
        return this.final;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFirstReceivedTime() {
        return this.firstReceivedTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getLastReceivedTime() {
        return this.lastReceivedTime;
    }

    public final TranscriptionSegment copy(String id2, String text, String language, boolean r13, long firstReceivedTime, long lastReceivedTime) {
        id2.getClass();
        text.getClass();
        language.getClass();
        return new TranscriptionSegment(id2, text, language, r13, firstReceivedTime, lastReceivedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptionSegment)) {
            return false;
        }
        TranscriptionSegment transcriptionSegment = (TranscriptionSegment) other;
        if (m.c(this.id, transcriptionSegment.id) && m.c(this.text, transcriptionSegment.text) && m.c(this.language, transcriptionSegment.language) && this.final == transcriptionSegment.final && this.firstReceivedTime == transcriptionSegment.firstReceivedTime && this.lastReceivedTime == transcriptionSegment.lastReceivedTime) {
            return true;
        }
        return false;
    }

    public final boolean getFinal() {
        return this.final;
    }

    public final long getFirstReceivedTime() {
        return this.firstReceivedTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final long getLastReceivedTime() {
        return this.lastReceivedTime;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TranscriptionSegment(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", final=");
        sb.append(this.final);
        sb.append(", firstReceivedTime=");
        sb.append(this.firstReceivedTime);
        sb.append(", lastReceivedTime=");
        return b.m(sb, this.lastReceivedTime, ')');
    }

    public TranscriptionSegment(String str, String str2, String str3, boolean z6, long j4, long j10) {
        i.s(str, str2, str3);
        this.id = str;
        this.text = str2;
        this.language = str3;
        this.final = z6;
        this.firstReceivedTime = j4;
        this.lastReceivedTime = j10;
    }
}
