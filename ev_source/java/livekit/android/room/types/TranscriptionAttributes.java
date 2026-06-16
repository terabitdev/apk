package io.livekit.android.room.types;

import java.io.StringReader;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import od.h;
import od.l;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/livekit/android/room/types/TranscriptionAttributes;", "", "lkSegmentID", "", "lkTranscribedTrackID", "lkTranscriptionFinal", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getLkSegmentID$annotations", "()V", "getLkSegmentID", "()Ljava/lang/String;", "getLkTranscribedTrackID$annotations", "getLkTranscribedTrackID", "getLkTranscriptionFinal$annotations", "getLkTranscriptionFinal", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/livekit/android/room/types/TranscriptionAttributes;", "equals", "other", "hashCode", "", "toJson", "toString", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class TranscriptionAttributes {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String lkSegmentID;
    private final String lkTranscribedTrackID;
    private final Boolean lkTranscriptionFinal;

    public /* synthetic */ TranscriptionAttributes(String str, String str2, Boolean bool, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : bool);
    }

    public static /* synthetic */ TranscriptionAttributes copy$default(TranscriptionAttributes transcriptionAttributes, String str, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transcriptionAttributes.lkSegmentID;
        }
        if ((i10 & 2) != 0) {
            str2 = transcriptionAttributes.lkTranscribedTrackID;
        }
        if ((i10 & 4) != 0) {
            bool = transcriptionAttributes.lkTranscriptionFinal;
        }
        return transcriptionAttributes.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLkSegmentID() {
        return this.lkSegmentID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLkTranscribedTrackID() {
        return this.lkTranscribedTrackID;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getLkTranscriptionFinal() {
        return this.lkTranscriptionFinal;
    }

    public final TranscriptionAttributes copy(String lkSegmentID, String lkTranscribedTrackID, Boolean lkTranscriptionFinal) {
        return new TranscriptionAttributes(lkSegmentID, lkTranscribedTrackID, lkTranscriptionFinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptionAttributes)) {
            return false;
        }
        TranscriptionAttributes transcriptionAttributes = (TranscriptionAttributes) other;
        if (m.c(this.lkSegmentID, transcriptionAttributes.lkSegmentID) && m.c(this.lkTranscribedTrackID, transcriptionAttributes.lkTranscribedTrackID) && m.c(this.lkTranscriptionFinal, transcriptionAttributes.lkTranscriptionFinal)) {
            return true;
        }
        return false;
    }

    public final String getLkSegmentID() {
        return this.lkSegmentID;
    }

    public final String getLkTranscribedTrackID() {
        return this.lkTranscribedTrackID;
    }

    public final Boolean getLkTranscriptionFinal() {
        return this.lkTranscriptionFinal;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.lkSegmentID;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.lkTranscribedTrackID;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Boolean bool = this.lkTranscriptionFinal;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return i12 + i10;
    }

    public final String toJson() {
        l lVar;
        lVar = AgentTypesKt.klaxon;
        return lVar.e(this, null);
    }

    public String toString() {
        return "TranscriptionAttributes(lkSegmentID=" + this.lkSegmentID + ", lkTranscribedTrackID=" + this.lkTranscribedTrackID + ", lkTranscriptionFinal=" + this.lkTranscriptionFinal + ')';
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/types/TranscriptionAttributes$Companion;", "", "()V", "fromJson", "Lio/livekit/android/room/types/TranscriptionAttributes;", "json", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final TranscriptionAttributes fromJson(String json) {
            l lVar;
            json.getClass();
            lVar = AgentTypesKt.klaxon;
            f0 f0Var = e0.f20562a;
            return (TranscriptionAttributes) lVar.c((h) l.d(lVar, f0Var.b(TranscriptionAttributes.class)).b0(new StringReader(json)), TranscriptionAttributes.class, f0Var.b(TranscriptionAttributes.class));
        }

        private Companion() {
        }
    }

    public TranscriptionAttributes(String str, String str2, Boolean bool) {
        this.lkSegmentID = str;
        this.lkTranscribedTrackID = str2;
        this.lkTranscriptionFinal = bool;
    }

    @od.f(name = "lk.segment_id")
    public static /* synthetic */ void getLkSegmentID$annotations() {
    }

    @od.f(name = "lk.transcribed_track_id")
    public static /* synthetic */ void getLkTranscribedTrackID$annotations() {
    }

    @od.f(name = "lk.transcription_final")
    public static /* synthetic */ void getLkTranscriptionFinal$annotations() {
    }

    public TranscriptionAttributes() {
        this(null, null, null, 7, null);
    }
}
