package io.livekit.android.room.participant;

import android.gov.nist.javax.sip.header.ParameterNames;
import defpackage.f;
import et.d;
import fr.g0;
import fr.z;
import ho.l;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.ParticipantEvent;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.track.RemoteAudioTrack;
import io.livekit.android.room.track.RemoteTrackPublication;
import io.livekit.android.room.track.RemoteVideoTrack;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackException;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.util.CloseableCoroutineScope;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.VideoTrack;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001@B?\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBC\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u0013J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010'\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00142\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u001dj\u0002`\u001f2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00142\b\b\u0002\u0010*\u001a\u00020#¢\u0006\u0004\b+\u0010,J\u0017\u00101\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00106\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lio/livekit/android/room/participant/RemoteParticipant;", "Lio/livekit/android/room/participant/Participant;", "Llivekit/LivekitModels$ParticipantInfo;", ParameterNames.INFO, "Lio/livekit/android/room/SignalClient;", "signalClient", "Lfr/z;", "ioDispatcher", "defaultDispatcher", "Lio/livekit/android/room/track/RemoteAudioTrack$Factory;", "audioTrackFactory", "Lio/livekit/android/room/track/RemoteVideoTrack$Factory;", "videoTrackFactory", "<init>", "(Llivekit/LivekitModels$ParticipantInfo;Lio/livekit/android/room/SignalClient;Lfr/z;Lfr/z;Lio/livekit/android/room/track/RemoteAudioTrack$Factory;Lio/livekit/android/room/track/RemoteVideoTrack$Factory;)V", "Lio/livekit/android/room/participant/Participant$Sid;", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "Lio/livekit/android/room/participant/Participant$Identity;", "identity", "(Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/room/SignalClient;Lfr/z;Lfr/z;Lio/livekit/android/room/track/RemoteAudioTrack$Factory;Lio/livekit/android/room/track/RemoteVideoTrack$Factory;Lkotlin/jvm/internal/f;)V", "", "Lio/livekit/android/room/track/RemoteTrackPublication;", "getTrackPublication", "(Ljava/lang/String;)Lio/livekit/android/room/track/RemoteTrackPublication;", "Lsn/z;", "updateFromInfo", "(Llivekit/LivekitModels$ParticipantInfo;)V", "Llivekit/org/webrtc/MediaStreamTrack;", "mediaTrack", "Lkotlin/Function1;", "Llivekit/org/webrtc/RTCStatsCollectorCallback;", "Lio/livekit/android/webrtc/RTCStatsGetter;", "statsGetter", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "", "autoManageVideo", "", "triesLeft", "addSubscribedMediaTrack", "(Llivekit/org/webrtc/MediaStreamTrack;Ljava/lang/String;Lho/l;Llivekit/org/webrtc/RtpReceiver;ZI)V", "trackSid", "sendUnpublish", "unpublishTrack", "(Ljava/lang/String;Z)V", "Llivekit/LivekitRtc$SubscriptionPermissionUpdate;", "subscriptionPermissionUpdate", "onSubscriptionPermissionUpdate$livekit_android_sdk_release", "(Llivekit/LivekitRtc$SubscriptionPermissionUpdate;)V", "onSubscriptionPermissionUpdate", "Lio/livekit/android/events/RoomEvent$DataReceived;", "event", "onDataReceived$livekit_android_sdk_release", "(Lio/livekit/android/events/RoomEvent$DataReceived;)V", "onDataReceived", "Lio/livekit/android/room/SignalClient;", "getSignalClient$livekit_android_sdk_release", "()Lio/livekit/android/room/SignalClient;", "Lfr/z;", "Lio/livekit/android/room/track/RemoteAudioTrack$Factory;", "Lio/livekit/android/room/track/RemoteVideoTrack$Factory;", "Lio/livekit/android/util/CloseableCoroutineScope;", "coroutineScope", "Lio/livekit/android/util/CloseableCoroutineScope;", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RemoteParticipant extends Participant {
    private final RemoteAudioTrack.Factory audioTrackFactory;
    private final CloseableCoroutineScope coroutineScope;
    private final z ioDispatcher;
    private final SignalClient signalClient;
    private final RemoteVideoTrack.Factory videoTrackFactory;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/participant/RemoteParticipant$Factory;", "", "create", "Lio/livekit/android/room/participant/RemoteParticipant;", ParameterNames.INFO, "Llivekit/LivekitModels$ParticipantInfo;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        RemoteParticipant create(LivekitModels$ParticipantInfo r12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RemoteParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, SignalClient signalClient, z zVar, z zVar2, RemoteAudioTrack.Factory factory, RemoteVideoTrack.Factory factory2) {
        this(r2, Participant.Identity.m2605constructorimpl(r0), signalClient, zVar, zVar2, factory, factory2, null);
        livekitModels$ParticipantInfo.getClass();
        signalClient.getClass();
        zVar.getClass();
        zVar2.getClass();
        factory.getClass();
        factory2.getClass();
        String sid = livekitModels$ParticipantInfo.getSid();
        sid.getClass();
        String m2612constructorimpl = Participant.Sid.m2612constructorimpl(sid);
        String identity = livekitModels$ParticipantInfo.getIdentity();
        identity.getClass();
        super.updateFromInfo(livekitModels$ParticipantInfo);
    }

    public static /* synthetic */ void addSubscribedMediaTrack$default(RemoteParticipant remoteParticipant, MediaStreamTrack mediaStreamTrack, String str, l lVar, RtpReceiver rtpReceiver, boolean z6, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z6 = false;
        }
        boolean z10 = z6;
        if ((i11 & 32) != 0) {
            i10 = 20;
        }
        remoteParticipant.addSubscribedMediaTrack(mediaStreamTrack, str, lVar, rtpReceiver, z10, i10);
    }

    public static /* synthetic */ void unpublishTrack$default(RemoteParticipant remoteParticipant, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        remoteParticipant.unpublishTrack(str, z6);
    }

    public final void addSubscribedMediaTrack(MediaStreamTrack mediaTrack, String r13, l statsGetter, RtpReceiver receiver, boolean autoManageVideo, int triesLeft) {
        Track create;
        mediaTrack.getClass();
        r13.getClass();
        statsGetter.getClass();
        receiver.getClass();
        RemoteTrackPublication trackPublication = getTrackPublication(r13);
        if (trackPublication == null) {
            if (triesLeft == 0) {
                String concat = "Could not find published track with sid: ".concat(r13);
                TrackException.InvalidTrackStateException invalidTrackStateException = new TrackException.InvalidTrackStateException(concat, null, 2, null);
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(null, "remote participant " + ((Object) Participant.Sid.m2616toStringimpl(getSid())) + " --- " + concat, new Object[0]);
                }
                ParticipantListener internalListener = getInternalListener();
                if (internalListener != null) {
                    internalListener.onTrackSubscriptionFailed(r13, invalidTrackStateException, this);
                }
                getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackSubscriptionFailed(this, r13, invalidTrackStateException), getScope());
                return;
            }
            g0.D(this.coroutineScope, null, null, new RemoteParticipant$addSubscribedMediaTrack$2(this, mediaTrack, r13, statsGetter, receiver, autoManageVideo, triesLeft, null), 3);
            return;
        }
        String kind = mediaTrack.kind();
        if (m.c(kind, "audio")) {
            create = this.audioTrackFactory.create("", (AudioTrack) mediaTrack, receiver);
        } else if (m.c(kind, "video")) {
            create = this.videoTrackFactory.create("", (VideoTrack) mediaTrack, autoManageVideo, receiver);
        } else {
            throw new TrackException.InvalidTrackTypeException(f.i("invalid track type: ", kind), null, 2, null);
        }
        create.setStatsGetter(statsGetter);
        trackPublication.setTrack$livekit_android_sdk_release(create);
        trackPublication.setSubscriptionAllowed$livekit_android_sdk_release(true);
        create.setName$livekit_android_sdk_release(trackPublication.getName());
        create.setSid$livekit_android_sdk_release(trackPublication.getSid());
        addTrackPublication(trackPublication);
        create.start();
        ParticipantListener internalListener2 = getInternalListener();
        if (internalListener2 != null) {
            internalListener2.onTrackSubscribed(create, trackPublication, this);
        }
        getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackSubscribed(this, create, trackPublication), getScope());
    }

    /* renamed from: getSignalClient$livekit_android_sdk_release, reason: from getter */
    public final SignalClient getSignalClient() {
        return this.signalClient;
    }

    public final RemoteTrackPublication getTrackPublication(String r22) {
        r22.getClass();
        TrackPublication trackPublication = getTrackPublications().get(r22);
        if (trackPublication instanceof RemoteTrackPublication) {
            return (RemoteTrackPublication) trackPublication;
        }
        return null;
    }

    public final void onDataReceived$livekit_android_sdk_release(RoomEvent.DataReceived event) {
        event.getClass();
        getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.DataReceived(this, event.getData(), event.getTopic(), event.getEncryptionType()), getScope());
    }

    public final void onSubscriptionPermissionUpdate$livekit_android_sdk_release(LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate) {
        RemoteTrackPublication remoteTrackPublication;
        subscriptionPermissionUpdate.getClass();
        TrackPublication trackPublication = getTrackPublications().get(subscriptionPermissionUpdate.getTrackSid());
        if (trackPublication instanceof RemoteTrackPublication) {
            remoteTrackPublication = (RemoteTrackPublication) trackPublication;
        } else {
            remoteTrackPublication = null;
        }
        if (remoteTrackPublication != null && remoteTrackPublication.getSubscriptionAllowed() != subscriptionPermissionUpdate.getAllowed()) {
            remoteTrackPublication.setSubscriptionAllowed$livekit_android_sdk_release(subscriptionPermissionUpdate.getAllowed());
            getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackSubscriptionPermissionChanged(this, remoteTrackPublication, remoteTrackPublication.getSubscriptionAllowed()), this.coroutineScope);
        }
    }

    public final void unpublishTrack(String trackSid, boolean sendUnpublish) {
        RemoteTrackPublication remoteTrackPublication;
        trackSid.getClass();
        TrackPublication trackPublication = getTrackPublications().get(trackSid);
        if (trackPublication instanceof RemoteTrackPublication) {
            remoteTrackPublication = (RemoteTrackPublication) trackPublication;
        } else {
            remoteTrackPublication = null;
        }
        if (remoteTrackPublication == null) {
            return;
        }
        LinkedHashMap T = a0.T(getTrackPublications());
        T.remove(trackSid);
        setTrackPublications(T);
        Track track = remoteTrackPublication.getTrack();
        if (track != null) {
            try {
                track.stop();
            } catch (Exception unused) {
            }
            ParticipantListener internalListener = getInternalListener();
            if (internalListener != null) {
                internalListener.onTrackUnsubscribed(track, remoteTrackPublication, this);
            }
            getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackUnsubscribed(this, track, remoteTrackPublication), getScope());
        }
        if (sendUnpublish) {
            ParticipantListener internalListener2 = getInternalListener();
            if (internalListener2 != null) {
                internalListener2.onTrackUnpublished(remoteTrackPublication, this);
            }
            getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackUnpublished(this, remoteTrackPublication), getScope());
        }
        remoteTrackPublication.setTrack$livekit_android_sdk_release(null);
    }

    @Override // io.livekit.android.room.participant.Participant
    public void updateFromInfo(LivekitModels$ParticipantInfo r11) {
        r11.getClass();
        super.updateFromInfo(r11);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : r11.getTracksList()) {
            String sid = livekitModels$TrackInfo.getSid();
            sid.getClass();
            RemoteTrackPublication trackPublication = getTrackPublication(sid);
            if (trackPublication == null) {
                trackPublication = new RemoteTrackPublication(livekitModels$TrackInfo, null, this, this.ioDispatcher, 2, null);
                linkedHashMap2.put(sid, trackPublication);
                addTrackPublication(trackPublication);
            } else {
                trackPublication.updateFromInfo(livekitModels$TrackInfo);
            }
            linkedHashMap.put(sid, trackPublication);
        }
        for (RemoteTrackPublication remoteTrackPublication : linkedHashMap2.values()) {
            ParticipantListener internalListener = getInternalListener();
            if (internalListener != null) {
                internalListener.onTrackPublished(remoteTrackPublication, this);
            }
            getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackPublished(this, remoteTrackPublication), getScope());
        }
        Iterator it = a.L(getTrackPublications().keySet(), linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            TrackPublication trackPublication2 = getTrackPublications().get((String) it.next());
            if (trackPublication2 != null) {
                unpublishTrack(trackPublication2.getSid(), true);
            }
        }
    }

    public /* synthetic */ RemoteParticipant(String str, String str2, SignalClient signalClient, z zVar, z zVar2, RemoteAudioTrack.Factory factory, RemoteVideoTrack.Factory factory2, int i10, kotlin.jvm.internal.f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2, signalClient, zVar, zVar2, factory, factory2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RemoteParticipant(String str, String str2, SignalClient signalClient, z zVar, z zVar2, RemoteAudioTrack.Factory factory, RemoteVideoTrack.Factory factory2) {
        super(str, str2, zVar2, null);
        str.getClass();
        signalClient.getClass();
        zVar.getClass();
        zVar2.getClass();
        factory.getClass();
        factory2.getClass();
        this.signalClient = signalClient;
        this.ioDispatcher = zVar;
        this.audioTrackFactory = factory;
        this.videoTrackFactory = factory2;
        this.coroutineScope = new CloseableCoroutineScope(zVar2.plus(g0.f()));
    }

    public /* synthetic */ RemoteParticipant(String str, String str2, SignalClient signalClient, z zVar, z zVar2, RemoteAudioTrack.Factory factory, RemoteVideoTrack.Factory factory2, kotlin.jvm.internal.f fVar) {
        this(str, str2, signalClient, zVar, zVar2, factory, factory2);
    }
}
