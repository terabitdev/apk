package io.livekit.android.room.participant;

import android.gov.nist.javax.sip.header.ParameterNames;
import as.d9;
import com.google.android.gms.internal.play_billing.b;
import io.livekit.android.room.track.Track;
import j0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ParticipantPermission;
import p.n;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lio/livekit/android/room/participant/ParticipantPermission;", "", "canPublish", "", "canSubscribe", "canPublishData", ParameterNames.HIDDEN, "recorder", "canPublishSources", "", "Lio/livekit/android/room/track/Track$Source;", "canUpdateMetadata", "canSubscribeMetrics", "(ZZZZZLjava/util/List;ZZ)V", "getCanPublish", "()Z", "getCanPublishData", "getCanPublishSources", "()Ljava/util/List;", "getCanSubscribe", "getCanSubscribeMetrics", "getCanUpdateMetadata", "getHidden", "getRecorder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ParticipantPermission {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canPublish;
    private final boolean canPublishData;
    private final List<Track.Source> canPublishSources;
    private final boolean canSubscribe;
    private final boolean canSubscribeMetrics;
    private final boolean canUpdateMetadata;
    private final boolean hidden;
    private final boolean recorder;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantPermission(boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, List<? extends Track.Source> list, boolean z14, boolean z15) {
        list.getClass();
        this.canPublish = z6;
        this.canSubscribe = z10;
        this.canPublishData = z11;
        this.hidden = z12;
        this.recorder = z13;
        this.canPublishSources = list;
        this.canUpdateMetadata = z14;
        this.canSubscribeMetrics = z15;
    }

    public static /* synthetic */ ParticipantPermission copy$default(ParticipantPermission participantPermission, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, List list, boolean z14, boolean z15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = participantPermission.canPublish;
        }
        if ((i10 & 2) != 0) {
            z10 = participantPermission.canSubscribe;
        }
        if ((i10 & 4) != 0) {
            z11 = participantPermission.canPublishData;
        }
        if ((i10 & 8) != 0) {
            z12 = participantPermission.hidden;
        }
        if ((i10 & 16) != 0) {
            z13 = participantPermission.recorder;
        }
        if ((i10 & 32) != 0) {
            list = participantPermission.canPublishSources;
        }
        if ((i10 & 64) != 0) {
            z14 = participantPermission.canUpdateMetadata;
        }
        if ((i10 & 128) != 0) {
            z15 = participantPermission.canSubscribeMetrics;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z13;
        List list2 = list;
        return participantPermission.copy(z6, z10, z11, z12, z18, list2, z16, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanPublish() {
        return this.canPublish;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanSubscribe() {
        return this.canSubscribe;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanPublishData() {
        return this.canPublishData;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRecorder() {
        return this.recorder;
    }

    public final List<Track.Source> component6() {
        return this.canPublishSources;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanUpdateMetadata() {
        return this.canUpdateMetadata;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCanSubscribeMetrics() {
        return this.canSubscribeMetrics;
    }

    public final ParticipantPermission copy(boolean canPublish, boolean canSubscribe, boolean canPublishData, boolean hidden, boolean recorder, List<? extends Track.Source> canPublishSources, boolean canUpdateMetadata, boolean canSubscribeMetrics) {
        canPublishSources.getClass();
        return new ParticipantPermission(canPublish, canSubscribe, canPublishData, hidden, recorder, canPublishSources, canUpdateMetadata, canSubscribeMetrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantPermission)) {
            return false;
        }
        ParticipantPermission participantPermission = (ParticipantPermission) other;
        if (this.canPublish == participantPermission.canPublish && this.canSubscribe == participantPermission.canSubscribe && this.canPublishData == participantPermission.canPublishData && this.hidden == participantPermission.hidden && this.recorder == participantPermission.recorder && m.c(this.canPublishSources, participantPermission.canPublishSources) && this.canUpdateMetadata == participantPermission.canUpdateMetadata && this.canSubscribeMetrics == participantPermission.canSubscribeMetrics) {
            return true;
        }
        return false;
    }

    public final boolean getCanPublish() {
        return this.canPublish;
    }

    public final boolean getCanPublishData() {
        return this.canPublishData;
    }

    public final List<Track.Source> getCanPublishSources() {
        return this.canPublishSources;
    }

    public final boolean getCanSubscribe() {
        return this.canSubscribe;
    }

    public final boolean getCanSubscribeMetrics() {
        return this.canSubscribeMetrics;
    }

    public final boolean getCanUpdateMetadata() {
        return this.canUpdateMetadata;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final boolean getRecorder() {
        return this.recorder;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canSubscribeMetrics) + b.f(n.d(b.f(b.f(b.f(b.f(Boolean.hashCode(this.canPublish) * 31, 31, this.canSubscribe), 31, this.canPublishData), 31, this.hidden), 31, this.recorder), 31, this.canPublishSources), 31, this.canUpdateMetadata);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParticipantPermission(canPublish=");
        sb.append(this.canPublish);
        sb.append(", canSubscribe=");
        sb.append(this.canSubscribe);
        sb.append(", canPublishData=");
        sb.append(this.canPublishData);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", recorder=");
        sb.append(this.recorder);
        sb.append(", canPublishSources=");
        sb.append(this.canPublishSources);
        sb.append(", canUpdateMetadata=");
        sb.append(this.canUpdateMetadata);
        sb.append(", canSubscribeMetrics=");
        return c.n(sb, this.canSubscribeMetrics, ')');
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/participant/ParticipantPermission$Companion;", "", "()V", "fromProto", "Lio/livekit/android/room/participant/ParticipantPermission;", "proto", "Llivekit/LivekitModels$ParticipantPermission;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final ParticipantPermission fromProto(LivekitModels$ParticipantPermission proto) {
            proto.getClass();
            boolean canPublish = proto.getCanPublish();
            boolean canSubscribe = proto.getCanSubscribe();
            boolean canPublishData = proto.getCanPublishData();
            boolean hidden = proto.getHidden();
            boolean recorder = proto.getRecorder();
            List<d9> canPublishSourcesList = proto.getCanPublishSourcesList();
            canPublishSourcesList.getClass();
            ArrayList arrayList = new ArrayList(p.a0(canPublishSourcesList, 10));
            for (d9 d9Var : canPublishSourcesList) {
                Track.Source.Companion companion = Track.Source.INSTANCE;
                d9Var.getClass();
                arrayList.add(companion.fromProto(d9Var));
            }
            return new ParticipantPermission(canPublish, canSubscribe, canPublishData, hidden, recorder, arrayList, proto.getCanUpdateMetadata(), proto.getCanSubscribeMetrics());
        }

        private Companion() {
        }
    }
}
