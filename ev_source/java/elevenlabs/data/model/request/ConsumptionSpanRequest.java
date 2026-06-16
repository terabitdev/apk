package io.elevenlabs.data.model.request;

import a2.m;
import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.a;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;
import ur.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0004fgheB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001eJ¢\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u0010\u00105\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J'\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0001¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010C\u0012\u0004\bH\u0010F\u001a\u0004\bG\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010I\u0012\u0004\bK\u0010F\u001a\u0004\bJ\u0010!R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010I\u0012\u0004\bM\u0010F\u001a\u0004\bL\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010N\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010N\u0012\u0004\bR\u0010F\u001a\u0004\bQ\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010N\u0012\u0004\bT\u0010F\u001a\u0004\bS\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010U\u0012\u0004\bW\u0010F\u001a\u0004\bV\u0010(R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010X\u0012\u0004\bZ\u0010F\u001a\u0004\bY\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u0010,R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010]\u0012\u0004\b_\u0010F\u001a\u0004\b^\u0010.R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010`\u0012\u0004\bb\u0010F\u001a\u0004\ba\u00100R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010C\u0012\u0004\bd\u0010F\u001a\u0004\bc\u0010\u001e¨\u0006i"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "", "", "spanId", "audioFileNumber", "", "startSeconds", "endSeconds", "", "startCharOffset", "endCharOffset", "listenedAtUnix", "", "playbackSpeed", "realTimeDurationSeconds", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "type", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "playbackSource", "", "deviceOnline", "voiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Double;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Double;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;Ljava/lang/Boolean;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "()Ljava/lang/Float;", "component9", "()Ljava/lang/Double;", "component10", "()Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "component11", "()Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "component12", "()Ljava/lang/Boolean;", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Double;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;Ljava/lang/Boolean;Ljava/lang/String;)Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getSpanId", "getSpanId$annotations", "()V", "getAudioFileNumber", "getAudioFileNumber$annotations", "D", "getStartSeconds", "getStartSeconds$annotations", "getEndSeconds", "getEndSeconds$annotations", "Ljava/lang/Long;", "getStartCharOffset", "getStartCharOffset$annotations", "getEndCharOffset", "getEndCharOffset$annotations", "getListenedAtUnix", "getListenedAtUnix$annotations", "Ljava/lang/Float;", "getPlaybackSpeed", "getPlaybackSpeed$annotations", "Ljava/lang/Double;", "getRealTimeDurationSeconds", "getRealTimeDurationSeconds$annotations", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "getType", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "getPlaybackSource", "getPlaybackSource$annotations", "Ljava/lang/Boolean;", "getDeviceOnline", "getDeviceOnline$annotations", "getVoiceId", "getVoiceId$annotations", "Companion", "Type", "PlaybackSource", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ConsumptionSpanRequest {
    private static final h[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String audioFileNumber;
    private final Boolean deviceOnline;
    private final Long endCharOffset;
    private final double endSeconds;
    private final Long listenedAtUnix;
    private final PlaybackSource playbackSource;
    private final Float playbackSpeed;
    private final Double realTimeDurationSeconds;
    private final String spanId;
    private final Long startCharOffset;
    private final double startSeconds;
    private final Type type;
    private final String voiceId;

    static {
        m mVar = new m(6);
        i iVar = i.f31597b;
        $childSerializers = new h[]{null, null, null, null, null, null, null, null, null, a.d(iVar, mVar), a.d(iVar, new m(7)), null, null};
    }

    public /* synthetic */ ConsumptionSpanRequest(int i10, String str, String str2, double d10, double d11, Long l4, Long l7, Long l10, Float f10, Double d12, Type type, PlaybackSource playbackSource, Boolean bool, String str3, c1 c1Var) {
        if (527 == (i10 & 527)) {
            this.spanId = str;
            this.audioFileNumber = str2;
            this.startSeconds = d10;
            this.endSeconds = d11;
            if ((i10 & 16) == 0) {
                this.startCharOffset = null;
            } else {
                this.startCharOffset = l4;
            }
            if ((i10 & 32) == 0) {
                this.endCharOffset = null;
            } else {
                this.endCharOffset = l7;
            }
            if ((i10 & 64) == 0) {
                this.listenedAtUnix = null;
            } else {
                this.listenedAtUnix = l10;
            }
            if ((i10 & 128) == 0) {
                this.playbackSpeed = null;
            } else {
                this.playbackSpeed = f10;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.realTimeDurationSeconds = null;
            } else {
                this.realTimeDurationSeconds = d12;
            }
            this.type = type;
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.playbackSource = null;
            } else {
                this.playbackSource = playbackSource;
            }
            if ((i10 & 2048) == 0) {
                this.deviceOnline = null;
            } else {
                this.deviceOnline = bool;
            }
            if ((i10 & 4096) == 0) {
                this.voiceId = null;
                return;
            } else {
                this.voiceId = str3;
                return;
            }
        }
        t0.j(i10, 527, ConsumptionSpanRequest$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Type.INSTANCE.serializer();
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return PlaybackSource.INSTANCE.serializer();
    }

    public static /* synthetic */ ConsumptionSpanRequest copy$default(ConsumptionSpanRequest consumptionSpanRequest, String str, String str2, double d10, double d11, Long l4, Long l7, Long l10, Float f10, Double d12, Type type, PlaybackSource playbackSource, Boolean bool, String str3, int i10, Object obj) {
        String str4;
        String str5;
        double d13;
        double d14;
        Long l11;
        Long l12;
        Long l13;
        Float f11;
        Double d15;
        Type type2;
        PlaybackSource playbackSource2;
        Boolean bool2;
        String str6;
        if ((i10 & 1) != 0) {
            str4 = consumptionSpanRequest.spanId;
        } else {
            str4 = str;
        }
        if ((i10 & 2) != 0) {
            str5 = consumptionSpanRequest.audioFileNumber;
        } else {
            str5 = str2;
        }
        if ((i10 & 4) != 0) {
            d13 = consumptionSpanRequest.startSeconds;
        } else {
            d13 = d10;
        }
        if ((i10 & 8) != 0) {
            d14 = consumptionSpanRequest.endSeconds;
        } else {
            d14 = d11;
        }
        if ((i10 & 16) != 0) {
            l11 = consumptionSpanRequest.startCharOffset;
        } else {
            l11 = l4;
        }
        if ((i10 & 32) != 0) {
            l12 = consumptionSpanRequest.endCharOffset;
        } else {
            l12 = l7;
        }
        if ((i10 & 64) != 0) {
            l13 = consumptionSpanRequest.listenedAtUnix;
        } else {
            l13 = l10;
        }
        if ((i10 & 128) != 0) {
            f11 = consumptionSpanRequest.playbackSpeed;
        } else {
            f11 = f10;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            d15 = consumptionSpanRequest.realTimeDurationSeconds;
        } else {
            d15 = d12;
        }
        if ((i10 & 512) != 0) {
            type2 = consumptionSpanRequest.type;
        } else {
            type2 = type;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            playbackSource2 = consumptionSpanRequest.playbackSource;
        } else {
            playbackSource2 = playbackSource;
        }
        if ((i10 & 2048) != 0) {
            bool2 = consumptionSpanRequest.deviceOnline;
        } else {
            bool2 = bool;
        }
        if ((i10 & 4096) != 0) {
            str6 = consumptionSpanRequest.voiceId;
        } else {
            str6 = str3;
        }
        return consumptionSpanRequest.copy(str4, str5, d13, d14, l11, l12, l13, f11, d15, type2, playbackSource2, bool2, str6);
    }

    public static final /* synthetic */ void write$Self$data_release(ConsumptionSpanRequest self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.spanId);
        output.V(serialDesc, 1, self.audioFileNumber);
        output.e0(serialDesc, 2, self.startSeconds);
        output.e0(serialDesc, 3, self.endSeconds);
        if (output.C(serialDesc) || self.startCharOffset != null) {
            output.o(serialDesc, 4, l0.f34611a, self.startCharOffset);
        }
        if (output.C(serialDesc) || self.endCharOffset != null) {
            output.o(serialDesc, 5, l0.f34611a, self.endCharOffset);
        }
        if (output.C(serialDesc) || self.listenedAtUnix != null) {
            output.o(serialDesc, 6, l0.f34611a, self.listenedAtUnix);
        }
        if (output.C(serialDesc) || self.playbackSpeed != null) {
            output.o(serialDesc, 7, z.f34681a, self.playbackSpeed);
        }
        if (output.C(serialDesc) || self.realTimeDurationSeconds != null) {
            output.o(serialDesc, 8, r.f34640a, self.realTimeDurationSeconds);
        }
        output.g(serialDesc, 9, (KSerializer) hVarArr[9].getValue(), self.type);
        if (output.C(serialDesc) || self.playbackSource != null) {
            output.o(serialDesc, 10, (KSerializer) hVarArr[10].getValue(), self.playbackSource);
        }
        if (output.C(serialDesc) || self.deviceOnline != null) {
            output.o(serialDesc, 11, ur.g.f34583a, self.deviceOnline);
        }
        if (output.C(serialDesc) || self.voiceId != null) {
            output.o(serialDesc, 12, g1.f34588a, self.voiceId);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getSpanId() {
        return this.spanId;
    }

    /* renamed from: component10, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component11, reason: from getter */
    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVoiceId() {
        return this.voiceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final double getStartSeconds() {
        return this.startSeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final double getEndSeconds() {
        return this.endSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getStartCharOffset() {
        return this.startCharOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getEndCharOffset() {
        return this.endCharOffset;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getListenedAtUnix() {
        return this.listenedAtUnix;
    }

    /* renamed from: component8, reason: from getter */
    public final Float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* renamed from: component9, reason: from getter */
    public final Double getRealTimeDurationSeconds() {
        return this.realTimeDurationSeconds;
    }

    public final ConsumptionSpanRequest copy(String spanId, String audioFileNumber, double startSeconds, double endSeconds, Long startCharOffset, Long endCharOffset, Long listenedAtUnix, Float playbackSpeed, Double realTimeDurationSeconds, Type type, PlaybackSource playbackSource, Boolean deviceOnline, String voiceId) {
        spanId.getClass();
        audioFileNumber.getClass();
        type.getClass();
        return new ConsumptionSpanRequest(spanId, audioFileNumber, startSeconds, endSeconds, startCharOffset, endCharOffset, listenedAtUnix, playbackSpeed, realTimeDurationSeconds, type, playbackSource, deviceOnline, voiceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsumptionSpanRequest)) {
            return false;
        }
        ConsumptionSpanRequest consumptionSpanRequest = (ConsumptionSpanRequest) other;
        if (kotlin.jvm.internal.m.c(this.spanId, consumptionSpanRequest.spanId) && kotlin.jvm.internal.m.c(this.audioFileNumber, consumptionSpanRequest.audioFileNumber) && Double.compare(this.startSeconds, consumptionSpanRequest.startSeconds) == 0 && Double.compare(this.endSeconds, consumptionSpanRequest.endSeconds) == 0 && kotlin.jvm.internal.m.c(this.startCharOffset, consumptionSpanRequest.startCharOffset) && kotlin.jvm.internal.m.c(this.endCharOffset, consumptionSpanRequest.endCharOffset) && kotlin.jvm.internal.m.c(this.listenedAtUnix, consumptionSpanRequest.listenedAtUnix) && kotlin.jvm.internal.m.c(this.playbackSpeed, consumptionSpanRequest.playbackSpeed) && kotlin.jvm.internal.m.c(this.realTimeDurationSeconds, consumptionSpanRequest.realTimeDurationSeconds) && this.type == consumptionSpanRequest.type && this.playbackSource == consumptionSpanRequest.playbackSource && kotlin.jvm.internal.m.c(this.deviceOnline, consumptionSpanRequest.deviceOnline) && kotlin.jvm.internal.m.c(this.voiceId, consumptionSpanRequest.voiceId)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final Boolean getDeviceOnline() {
        return this.deviceOnline;
    }

    public final Long getEndCharOffset() {
        return this.endCharOffset;
    }

    public final double getEndSeconds() {
        return this.endSeconds;
    }

    public final Long getListenedAtUnix() {
        return this.listenedAtUnix;
    }

    public final PlaybackSource getPlaybackSource() {
        return this.playbackSource;
    }

    public final Float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final Double getRealTimeDurationSeconds() {
        return this.realTimeDurationSeconds;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final Long getStartCharOffset() {
        return this.startCharOffset;
    }

    public final double getStartSeconds() {
        return this.startSeconds;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int c5 = n.c(n.c(c.c(this.spanId.hashCode() * 31, 31, this.audioFileNumber), 31, this.startSeconds), 31, this.endSeconds);
        Long l4 = this.startCharOffset;
        int i10 = 0;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
        Long l7 = this.endCharOffset;
        if (l7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l7.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Long l10 = this.listenedAtUnix;
        if (l10 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l10.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Float f10 = this.playbackSpeed;
        if (f10 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f10.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Double d10 = this.realTimeDurationSeconds;
        if (d10 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = d10.hashCode();
        }
        int hashCode8 = (this.type.hashCode() + ((i14 + hashCode5) * 31)) * 31;
        PlaybackSource playbackSource = this.playbackSource;
        if (playbackSource == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = playbackSource.hashCode();
        }
        int i15 = (hashCode8 + hashCode6) * 31;
        Boolean bool = this.deviceOnline;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        String str = this.voiceId;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i16 + i10;
    }

    public String toString() {
        String str = this.spanId;
        String str2 = this.audioFileNumber;
        double d10 = this.startSeconds;
        double d11 = this.endSeconds;
        Long l4 = this.startCharOffset;
        Long l7 = this.endCharOffset;
        Long l10 = this.listenedAtUnix;
        Float f10 = this.playbackSpeed;
        Double d12 = this.realTimeDurationSeconds;
        Type type = this.type;
        PlaybackSource playbackSource = this.playbackSource;
        Boolean bool = this.deviceOnline;
        String str3 = this.voiceId;
        StringBuilder s10 = f.s("ConsumptionSpanRequest(spanId=", str, ", audioFileNumber=", str2, ", startSeconds=");
        s10.append(d10);
        s10.append(", endSeconds=");
        s10.append(d11);
        s10.append(", startCharOffset=");
        s10.append(l4);
        s10.append(", endCharOffset=");
        s10.append(l7);
        s10.append(", listenedAtUnix=");
        s10.append(l10);
        s10.append(", playbackSpeed=");
        s10.append(f10);
        s10.append(", realTimeDurationSeconds=");
        s10.append(d12);
        s10.append(", type=");
        s10.append(type);
        s10.append(", playbackSource=");
        s10.append(playbackSource);
        s10.append(", deviceOnline=");
        s10.append(bool);
        s10.append(", voiceId=");
        return f.l(str3, Separators.RPAREN, s10);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "", "<init>", "(Ljava/lang/String;I)V", "ONLINE", "OFFLINE", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class PlaybackSource extends Enum<PlaybackSource> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ PlaybackSource[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PlaybackSource ONLINE = new PlaybackSource("ONLINE", 0);
        public static final PlaybackSource OFFLINE = new PlaybackSource("OFFLINE", 1);

        private static final /* synthetic */ PlaybackSource[] $values() {
            return new PlaybackSource[]{ONLINE, OFFLINE};
        }

        static {
            PlaybackSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = a.d(i.f31597b, new m(8));
        }

        private PlaybackSource(String str, int i10) {
            super(str, i10);
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.request.ConsumptionSpanRequest.PlaybackSource", values(), new String[]{"online", "offline"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static PlaybackSource valueOf(String str) {
            return (PlaybackSource) Enum.valueOf(PlaybackSource.class, str);
        }

        public static PlaybackSource[] values() {
            return (PlaybackSource[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$PlaybackSource;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) PlaybackSource.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TTS", "MEDIA", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @g
    /* loaded from: classes3.dex */
    public static final class Type extends Enum<Type> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final h $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type TTS = new Type("TTS", 0);
        public static final Type MEDIA = new Type("MEDIA", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TTS, MEDIA};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = rd.c1.q($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = a.d(i.f31597b, new m(9));
        }

        private Type(String str, int i10) {
            super(str, i10);
        }

        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return t0.e("io.elevenlabs.data.model.request.ConsumptionSpanRequest.Type", values(), new String[]{"tts", "media"}, new Annotation[][]{null, null});
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ConsumptionSpanRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAudioFileNumber$annotations() {
    }

    public static /* synthetic */ void getDeviceOnline$annotations() {
    }

    public static /* synthetic */ void getEndCharOffset$annotations() {
    }

    public static /* synthetic */ void getEndSeconds$annotations() {
    }

    public static /* synthetic */ void getListenedAtUnix$annotations() {
    }

    public static /* synthetic */ void getPlaybackSource$annotations() {
    }

    public static /* synthetic */ void getPlaybackSpeed$annotations() {
    }

    public static /* synthetic */ void getRealTimeDurationSeconds$annotations() {
    }

    public static /* synthetic */ void getSpanId$annotations() {
    }

    public static /* synthetic */ void getStartCharOffset$annotations() {
    }

    public static /* synthetic */ void getStartSeconds$annotations() {
    }

    public static /* synthetic */ void getVoiceId$annotations() {
    }

    public ConsumptionSpanRequest(String str, String str2, double d10, double d11, Long l4, Long l7, Long l10, Float f10, Double d12, Type type, PlaybackSource playbackSource, Boolean bool, String str3) {
        str.getClass();
        str2.getClass();
        type.getClass();
        this.spanId = str;
        this.audioFileNumber = str2;
        this.startSeconds = d10;
        this.endSeconds = d11;
        this.startCharOffset = l4;
        this.endCharOffset = l7;
        this.listenedAtUnix = l10;
        this.playbackSpeed = f10;
        this.realTimeDurationSeconds = d12;
        this.type = type;
        this.playbackSource = playbackSource;
        this.deviceOnline = bool;
        this.voiceId = str3;
    }

    public /* synthetic */ ConsumptionSpanRequest(String str, String str2, double d10, double d11, Long l4, Long l7, Long l10, Float f10, Double d12, Type type, PlaybackSource playbackSource, Boolean bool, String str3, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, d10, d11, (i10 & 16) != 0 ? null : l4, (i10 & 32) != 0 ? null : l7, (i10 & 64) != 0 ? null : l10, (i10 & 128) != 0 ? null : f10, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : d12, type, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : playbackSource, (i10 & 2048) != 0 ? null : bool, (i10 & 4096) != 0 ? null : str3);
    }
}
