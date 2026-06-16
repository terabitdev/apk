package io.livekit.android.e2ee;

import androidx.credentials.playservices.controllers.GetRestoreCredential.b;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import et.d;
import ho.l;
import io.livekit.android.dagger.InjectionNames;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.e2ee.KeyProvider;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.room.Room;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.RemoteAudioTrack;
import io.livekit.android.room.track.RemoteVideoTrack;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.FrameCryptor;
import livekit.org.webrtc.FrameCryptorAlgorithm;
import livekit.org.webrtc.FrameCryptorFactory;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpSender;
import sn.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001gB#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\"J)\u0010)\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b)\u0010*J-\u00101\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b1\u00102J-\u00103\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b3\u00102J-\u00105\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u0002042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b5\u00106J-\u00107\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u0002042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b7\u00106J\u0015\u00109\u001a\u00020'2\u0006\u00108\u001a\u00020\u001f¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020'¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020'H\u0000¢\u0006\u0004\b=\u0010<J\u000f\u0010@\u001a\u00020'H\u0000¢\u0006\u0004\b?\u0010<J\u0017\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\"\u0010I\u001a\u0004\u0018\u00010A2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010F\u001a\u00020Cø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010NR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010OR.\u0010R\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110Q\u0012\u0004\u0012\u00020\u00160P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'0%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010WR\"\u0010Y\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u00108\u001a\u00020\u001f2\u0006\u0010_\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010`\u001a\u0004\ba\u0010!\"\u0004\bb\u0010:R(\u0010c\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010`\u0012\u0004\bf\u0010<\u001a\u0004\bd\u0010!\"\u0004\be\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lio/livekit/android/e2ee/E2EEManager;", "", "Lio/livekit/android/e2ee/KeyProvider;", "keyProvider", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "dataPacketCryptorManagerFactory", "<init>", "(Lio/livekit/android/e2ee/KeyProvider;Llivekit/org/webrtc/PeerConnectionFactory;Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;)V", "Llivekit/org/webrtc/FrameCryptor$FrameCryptionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/livekit/android/e2ee/E2EEState;", "e2eeStateFromFrameCryptoState", "(Llivekit/org/webrtc/FrameCryptor$FrameCryptionState;)Lio/livekit/android/e2ee/E2EEState;", "Llivekit/org/webrtc/RtpSender;", InjectionNames.SENDER, "Lio/livekit/android/room/participant/Participant$Identity;", "participantId", "", "trackId", "kind", "Llivekit/org/webrtc/FrameCryptor;", "addRtpSender-8-r6qqA", "(Llivekit/org/webrtc/RtpSender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llivekit/org/webrtc/FrameCryptor;", "addRtpSender", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "addRtpReceiver-8-r6qqA", "(Llivekit/org/webrtc/RtpReceiver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llivekit/org/webrtc/FrameCryptor;", "addRtpReceiver", "", "isDataChannelEncryptionEnabled", "()Z", "()Lio/livekit/android/e2ee/KeyProvider;", "Lio/livekit/android/room/Room;", "room", "Lkotlin/Function1;", "Lio/livekit/android/events/RoomEvent;", "Lsn/z;", "emitEvent", "setup", "(Lio/livekit/android/room/Room;Lho/l;)V", "Lio/livekit/android/room/track/Track;", "track", "Lio/livekit/android/room/track/TrackPublication;", "publication", "Lio/livekit/android/room/participant/RemoteParticipant;", "participant", "addSubscribedTrack", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/Room;)V", "removeSubscribedTrack", "Lio/livekit/android/room/participant/LocalParticipant;", "addPublishedTrack", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/Room;)V", "removePublishedTrack", "enabled", "enableE2EE", "(Z)V", "ratchetKey", "()V", "cleanup$livekit_android_sdk_release", "cleanup", "dispose$livekit_android_sdk_release", "dispose", "", "byteArray", "Lio/livekit/android/e2ee/EncryptedPacket;", "encrypt", "([B)Lio/livekit/android/e2ee/EncryptedPacket;", "packet", "decrypt-tq5M0Po", "(Ljava/lang/String;Lio/livekit/android/e2ee/EncryptedPacket;)[B", "decrypt", "Lio/livekit/android/e2ee/KeyProvider;", "getKeyProvider", "Llivekit/org/webrtc/PeerConnectionFactory;", "getPeerConnectionFactory", "()Llivekit/org/webrtc/PeerConnectionFactory;", "Lio/livekit/android/room/Room;", "", "Lsn/k;", "frameCryptors", "Ljava/util/Map;", "Llivekit/org/webrtc/FrameCryptorAlgorithm;", "algorithm", "Llivekit/org/webrtc/FrameCryptorAlgorithm;", "Lho/l;", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "dataPacketCryptorManager", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "getDataPacketCryptorManager$livekit_android_sdk_release", "()Lio/livekit/android/e2ee/DataPacketCryptorManager;", "setDataPacketCryptorManager$livekit_android_sdk_release", "(Lio/livekit/android/e2ee/DataPacketCryptorManager;)V", "value", "Z", "getEnabled", "setEnabled", "dataChannelEncryptionEnabled", "getDataChannelEncryptionEnabled", "setDataChannelEncryptionEnabled", "getDataChannelEncryptionEnabled$annotations", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class E2EEManager {
    private FrameCryptorAlgorithm algorithm;
    private boolean dataChannelEncryptionEnabled;
    private DataPacketCryptorManager dataPacketCryptorManager;
    private l emitEvent;
    private boolean enabled;
    private Map<k, FrameCryptor> frameCryptors;
    private final KeyProvider keyProvider;
    private final PeerConnectionFactory peerConnectionFactory;
    private Room room;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/e2ee/E2EEManager$Factory;", "", "create", "Lio/livekit/android/e2ee/E2EEManager;", "keyProvider", "Lio/livekit/android/e2ee/KeyProvider;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        E2EEManager create(KeyProvider keyProvider);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameCryptor.FrameCryptionState.values().length];
            try {
                iArr[FrameCryptor.FrameCryptionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.KEYRATCHETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.MISSINGKEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.ENCRYPTIONFAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.DECRYPTIONFAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FrameCryptor.FrameCryptionState.INTERNALERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public E2EEManager(KeyProvider keyProvider, PeerConnectionFactory peerConnectionFactory, DataPacketCryptorManager.Factory factory) {
        keyProvider.getClass();
        peerConnectionFactory.getClass();
        factory.getClass();
        this.keyProvider = keyProvider;
        this.peerConnectionFactory = peerConnectionFactory;
        this.frameCryptors = new LinkedHashMap();
        this.algorithm = FrameCryptorAlgorithm.AES_GCM;
        this.dataPacketCryptorManager = factory.create(keyProvider);
    }

    public static /* synthetic */ void a(E2EEManager e2EEManager, Room room, TrackPublication trackPublication, LocalParticipant localParticipant, String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        addPublishedTrack$lambda$6(e2EEManager, room, trackPublication, localParticipant, str, frameCryptionState);
    }

    public static final void addPublishedTrack$lambda$6(E2EEManager e2EEManager, Room room, TrackPublication trackPublication, LocalParticipant localParticipant, String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        e2EEManager.getClass();
        room.getClass();
        trackPublication.getClass();
        localParticipant.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.c(null, "Sender::onFrameCryptionStateChanged: " + str + ", state:  " + frameCryptionState, new Object[0]);
        }
        l lVar = e2EEManager.emitEvent;
        if (lVar != null) {
            Track track = trackPublication.getTrack();
            track.getClass();
            lVar.invoke(new RoomEvent.TrackE2EEStateEvent(room, track, trackPublication, localParticipant, e2EEManager.e2eeStateFromFrameCryptoState(frameCryptionState)));
            return;
        }
        m.i("emitEvent");
        throw null;
    }

    /* renamed from: addRtpReceiver-8-r6qqA */
    private final FrameCryptor m2521addRtpReceiver8r6qqA(RtpReceiver receiver, String participantId, String trackId, String kind) {
        FrameCryptor createFrameCryptorForRtpReceiver = FrameCryptorFactory.createFrameCryptorForRtpReceiver(this.peerConnectionFactory, receiver, participantId, this.algorithm, this.keyProvider.getRtcKeyProvider());
        Map<k, FrameCryptor> map = this.frameCryptors;
        k kVar = new k(trackId, Participant.Identity.m2604boximpl(participantId));
        createFrameCryptorForRtpReceiver.getClass();
        map.put(kVar, createFrameCryptorForRtpReceiver);
        createFrameCryptorForRtpReceiver.setEnabled(this.enabled);
        createFrameCryptorForRtpReceiver.setKeyIndex(this.keyProvider.getLatestKeyIndex(participantId));
        return createFrameCryptorForRtpReceiver;
    }

    /* renamed from: addRtpSender-8-r6qqA */
    private final FrameCryptor m2522addRtpSender8r6qqA(RtpSender r32, String participantId, String trackId, String kind) {
        FrameCryptor createFrameCryptorForRtpSender = FrameCryptorFactory.createFrameCryptorForRtpSender(this.peerConnectionFactory, r32, participantId, this.algorithm, this.keyProvider.getRtcKeyProvider());
        Map<k, FrameCryptor> map = this.frameCryptors;
        k kVar = new k(trackId, Participant.Identity.m2604boximpl(participantId));
        createFrameCryptorForRtpSender.getClass();
        map.put(kVar, createFrameCryptorForRtpSender);
        createFrameCryptorForRtpSender.setEnabled(this.enabled);
        createFrameCryptorForRtpSender.setKeyIndex(this.keyProvider.getLatestKeyIndex(participantId));
        return createFrameCryptorForRtpSender;
    }

    public static final void addSubscribedTrack$lambda$4(E2EEManager e2EEManager, Room room, TrackPublication trackPublication, RemoteParticipant remoteParticipant, String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        e2EEManager.getClass();
        room.getClass();
        trackPublication.getClass();
        remoteParticipant.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.c(null, "Receiver::onFrameCryptionStateChanged: " + str + ", state:  " + frameCryptionState, new Object[0]);
        }
        l lVar = e2EEManager.emitEvent;
        if (lVar != null) {
            Track track = trackPublication.getTrack();
            track.getClass();
            lVar.invoke(new RoomEvent.TrackE2EEStateEvent(room, track, trackPublication, remoteParticipant, e2EEManager.e2eeStateFromFrameCryptoState(frameCryptionState)));
            return;
        }
        m.i("emitEvent");
        throw null;
    }

    public static /* synthetic */ void b(E2EEManager e2EEManager, Room room, TrackPublication trackPublication, RemoteParticipant remoteParticipant, String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        addSubscribedTrack$lambda$4(e2EEManager, room, trackPublication, remoteParticipant, str, frameCryptionState);
    }

    private final E2EEState e2eeStateFromFrameCryptoState(FrameCryptor.FrameCryptionState r22) {
        int i10;
        if (r22 == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[r22.ordinal()];
        }
        switch (i10) {
            case 1:
                return E2EEState.NEW;
            case 2:
                return E2EEState.OK;
            case 3:
                return E2EEState.KEY_RATCHETED;
            case 4:
                return E2EEState.MISSING_KEY;
            case 5:
                return E2EEState.ENCRYPTION_FAILED;
            case 6:
                return E2EEState.DECRYPTION_FAILED;
            case 7:
                return E2EEState.INTERNAL_ERROR;
            default:
                return E2EEState.INTERNAL_ERROR;
        }
    }

    public final void addPublishedTrack(Track track, TrackPublication publication, LocalParticipant participant, Room room) {
        RtpSender sender$livekit_android_sdk_release;
        track.getClass();
        publication.getClass();
        participant.getClass();
        room.getClass();
        Track track2 = publication.getTrack();
        track2.getClass();
        if (track2 instanceof LocalAudioTrack) {
            Track track3 = publication.getTrack();
            track3.getClass();
            sender$livekit_android_sdk_release = ((LocalAudioTrack) track3).getSender$livekit_android_sdk_release();
        } else if (track2 instanceof LocalVideoTrack) {
            Track track4 = publication.getTrack();
            track4.getClass();
            sender$livekit_android_sdk_release = ((LocalVideoTrack) track4).getSender$livekit_android_sdk_release();
        } else {
            c6.t("unsupported track type");
            return;
        }
        if (sender$livekit_android_sdk_release != null) {
            String m2596getIdentity4WamZwg = participant.m2596getIdentity4WamZwg();
            m2596getIdentity4WamZwg.getClass();
            String sid = publication.getSid();
            Track track5 = publication.getTrack();
            track5.getClass();
            String lowerCase = track5.getKind().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            m2522addRtpSender8r6qqA(sender$livekit_android_sdk_release, m2596getIdentity4WamZwg, sid, lowerCase).setObserver(new b(this, room, publication, participant, 4));
            return;
        }
        c6.t("rtpSender is null");
    }

    public final void addSubscribedTrack(Track track, TrackPublication publication, RemoteParticipant participant, Room room) {
        RtpReceiver receiver;
        track.getClass();
        publication.getClass();
        participant.getClass();
        room.getClass();
        Track track2 = publication.getTrack();
        track2.getClass();
        if (track2 instanceof RemoteAudioTrack) {
            Track track3 = publication.getTrack();
            track3.getClass();
            receiver = ((RemoteAudioTrack) track3).getReceiver();
        } else if (track2 instanceof RemoteVideoTrack) {
            Track track4 = publication.getTrack();
            track4.getClass();
            receiver = ((RemoteVideoTrack) track4).getReceiver();
        } else {
            c6.t("unsupported track type");
            return;
        }
        receiver.getClass();
        String m2596getIdentity4WamZwg = participant.m2596getIdentity4WamZwg();
        m2596getIdentity4WamZwg.getClass();
        String sid = publication.getSid();
        Track track5 = publication.getTrack();
        track5.getClass();
        String lowerCase = track5.getKind().name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        m2521addRtpReceiver8r6qqA(receiver, m2596getIdentity4WamZwg, sid, lowerCase).setObserver(new b(this, room, publication, participant, 5));
    }

    public final void cleanup$livekit_android_sdk_release() {
        Iterator<FrameCryptor> it = this.frameCryptors.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.frameCryptors.clear();
    }

    /* renamed from: decrypt-tq5M0Po */
    public final byte[] m2523decrypttq5M0Po(String participantId, EncryptedPacket packet) {
        participantId.getClass();
        packet.getClass();
        return this.dataPacketCryptorManager.mo2519decrypttq5M0Po(participantId, packet);
    }

    public final void dispose$livekit_android_sdk_release() {
        this.dataPacketCryptorManager.dispose();
    }

    public final void enableE2EE(boolean enabled) {
        setEnabled(enabled);
    }

    public final EncryptedPacket encrypt(byte[] byteArray) {
        String m2605constructorimpl;
        LocalParticipant localParticipant;
        byteArray.getClass();
        Room room = this.room;
        if (room == null || (localParticipant = room.getLocalParticipant()) == null || (m2605constructorimpl = localParticipant.m2596getIdentity4WamZwg()) == null) {
            m2605constructorimpl = Participant.Identity.m2605constructorimpl("");
        }
        return this.dataPacketCryptorManager.mo2520encryptbi5aZsc(m2605constructorimpl, this.keyProvider.getLatestKeyIndex(m2605constructorimpl), byteArray);
    }

    public final boolean getDataChannelEncryptionEnabled() {
        return this.dataChannelEncryptionEnabled;
    }

    /* renamed from: getDataPacketCryptorManager$livekit_android_sdk_release, reason: from getter */
    public final DataPacketCryptorManager getDataPacketCryptorManager() {
        return this.dataPacketCryptorManager;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final KeyProvider getKeyProvider() {
        return this.keyProvider;
    }

    public final PeerConnectionFactory getPeerConnectionFactory() {
        return this.peerConnectionFactory;
    }

    public final boolean isDataChannelEncryptionEnabled() {
        if (this.enabled && this.dataChannelEncryptionEnabled) {
            return true;
        }
        return false;
    }

    public final KeyProvider keyProvider() {
        return this.keyProvider;
    }

    public final void ratchetKey() {
        byte[] ratchetSharedKey$default = KeyProvider.DefaultImpls.ratchetSharedKey$default(this.keyProvider, null, 1, null);
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.a(null, "ratchetSharedKey: newKey: " + ratchetSharedKey$default, new Object[0]);
        }
    }

    public final void removePublishedTrack(Track track, TrackPublication publication, LocalParticipant participant, Room room) {
        Participant.Identity identity;
        track.getClass();
        publication.getClass();
        participant.getClass();
        room.getClass();
        String sid = publication.getSid();
        String m2596getIdentity4WamZwg = participant.m2596getIdentity4WamZwg();
        Map<k, FrameCryptor> map = this.frameCryptors;
        Participant.Identity identity2 = null;
        if (m2596getIdentity4WamZwg != null) {
            identity = Participant.Identity.m2604boximpl(m2596getIdentity4WamZwg);
        } else {
            identity = null;
        }
        FrameCryptor frameCryptor = map.get(new k(sid, identity));
        if (frameCryptor != null) {
            frameCryptor.setEnabled(false);
            frameCryptor.dispose();
            Map<k, FrameCryptor> map2 = this.frameCryptors;
            if (m2596getIdentity4WamZwg != null) {
                identity2 = Participant.Identity.m2604boximpl(m2596getIdentity4WamZwg);
            }
            i0.b(map2).remove(new k(sid, identity2));
        }
    }

    public final void removeSubscribedTrack(Track track, TrackPublication publication, RemoteParticipant participant, Room room) {
        Participant.Identity identity;
        track.getClass();
        publication.getClass();
        participant.getClass();
        room.getClass();
        String sid = publication.getSid();
        String m2596getIdentity4WamZwg = participant.m2596getIdentity4WamZwg();
        Map<k, FrameCryptor> map = this.frameCryptors;
        Participant.Identity identity2 = null;
        if (m2596getIdentity4WamZwg != null) {
            identity = Participant.Identity.m2604boximpl(m2596getIdentity4WamZwg);
        } else {
            identity = null;
        }
        FrameCryptor frameCryptor = map.get(new k(sid, identity));
        if (frameCryptor != null) {
            frameCryptor.setEnabled(false);
            frameCryptor.dispose();
            Map<k, FrameCryptor> map2 = this.frameCryptors;
            if (m2596getIdentity4WamZwg != null) {
                identity2 = Participant.Identity.m2604boximpl(m2596getIdentity4WamZwg);
            }
            i0.b(map2).remove(new k(sid, identity2));
        }
    }

    public final void setDataChannelEncryptionEnabled(boolean z6) {
        this.dataChannelEncryptionEnabled = z6;
    }

    public final void setDataPacketCryptorManager$livekit_android_sdk_release(DataPacketCryptorManager dataPacketCryptorManager) {
        dataPacketCryptorManager.getClass();
        this.dataPacketCryptorManager = dataPacketCryptorManager;
    }

    public final void setEnabled(boolean z6) {
        this.enabled = z6;
        Iterator<Map.Entry<k, FrameCryptor>> it = this.frameCryptors.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setEnabled(this.enabled);
        }
    }

    public final void setup(Room room, l emitEvent) {
        Map<Participant.Identity, RemoteParticipant> remoteParticipants;
        Map<String, TrackPublication> trackPublications;
        room.getClass();
        emitEvent.getClass();
        if (!m.c(this.room, room) && this.room != null) {
            cleanup$livekit_android_sdk_release();
        }
        setEnabled(true);
        this.room = room;
        this.emitEvent = emitEvent;
        LocalParticipant localParticipant = room.getLocalParticipant();
        if (localParticipant != null && (trackPublications = localParticipant.getTrackPublications()) != null) {
            for (Map.Entry<String, TrackPublication> entry : trackPublications.entrySet()) {
                Room room2 = this.room;
                room2.getClass();
                LocalParticipant localParticipant2 = room2.getLocalParticipant();
                TrackPublication value = entry.getValue();
                if (value.getTrack() != null) {
                    Track track = value.getTrack();
                    track.getClass();
                    addPublishedTrack(track, value, localParticipant2, room);
                }
            }
        }
        Room room3 = this.room;
        if (room3 != null && (remoteParticipants = room3.getRemoteParticipants()) != null) {
            Iterator<Map.Entry<Participant.Identity, RemoteParticipant>> it = remoteParticipants.entrySet().iterator();
            while (it.hasNext()) {
                RemoteParticipant value2 = it.next().getValue();
                Iterator<Map.Entry<String, TrackPublication>> it2 = value2.getTrackPublications().entrySet().iterator();
                while (it2.hasNext()) {
                    TrackPublication value3 = it2.next().getValue();
                    if (value3.getTrack() != null) {
                        Track track2 = value3.getTrack();
                        track2.getClass();
                        addSubscribedTrack(track2, value3, value2, room);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void getDataChannelEncryptionEnabled$annotations() {
    }
}
