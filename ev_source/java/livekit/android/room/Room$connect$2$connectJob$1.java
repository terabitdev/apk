package io.livekit.android.room;

import com.google.protobuf.c6;
import defpackage.f;
import et.d;
import fr.g0;
import ho.p;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.audio.AuthedAudioProcessingController;
import io.livekit.android.room.RegionUrlProvider;
import io.livekit.android.room.metrics.RTCMetricsManagerKt;
import io.livekit.android.room.network.NetworkCallbackManager;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.net.URI;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$connect$2$connectJob$1", f = "Room.kt", l = {503, 509, 523, 532}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$connect$2$connectJob$1 extends i implements p {
    final /* synthetic */ ConnectOptions $options;
    final /* synthetic */ d0 $roomOptions;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ Room this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.Room$connect$2$connectJob$1$1", f = "Room.kt", l = {488}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.Room$connect$2$connectJob$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;
        final /* synthetic */ Room this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Room room, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = room;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            RegionUrlProvider regionUrlProvider;
            int i10 = this.label;
            try {
            } catch (Exception e10) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(e10, "could not fetch region settings", new Object[0]);
                }
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                regionUrlProvider = this.this$0.regionUrlProvider;
                if (regionUrlProvider != null) {
                    this.label = 1;
                    obj = regionUrlProvider.fetchRegionSettings(this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
            return z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.Room$connect$2$connectJob$1$3", f = "Room.kt", l = {540}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.Room$connect$2$connectJob$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends i implements p {
        int label;
        final /* synthetic */ Room this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Room room, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.this$0 = room;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass3(this.this$0, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                if (this.this$0.getEnableMetrics()) {
                    Room room = this.this$0;
                    RTCEngine engine = room.getEngine();
                    this.label = 1;
                    Object collectMetrics = RTCMetricsManagerKt.collectMetrics(room, engine, this);
                    xn.a aVar = xn.a.f37986a;
                    if (collectMetrics == aVar) {
                        return aVar;
                    }
                }
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$connect$2$connectJob$1(Room room, String str, String str2, ConnectOptions connectOptions, d0 d0Var, c<? super Room$connect$2$connectJob$1> cVar) {
        super(2, cVar);
        this.this$0 = room;
        this.$url = str;
        this.$token = str2;
        this.$options = connectOptions;
        this.$roomOptions = d0Var;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        Room$connect$2$connectJob$1 room$connect$2$connectJob$1 = new Room$connect$2$connectJob$1(this.this$0, this.$url, this.$token, this.$options, this.$roomOptions, cVar);
        room$connect$2$connectJob$1.L$0 = obj;
        return room$connect$2$connectJob$1;
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((Room$connect$2$connectJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x022a, code lost:
    
        if (r0 == r11) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e6, code lost:
    
        if (r0 == r11) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a8  */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0168 -> B:30:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x016e -> B:31:0x0171). Please report as a decompilation issue!!! */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RegionUrlProvider regionUrlProvider;
        URI uri;
        String str;
        fr.d0 d0Var;
        d0 d0Var2;
        RegionUrlProvider regionUrlProvider2;
        RegionUrlProvider regionUrlProvider3;
        RegionUrlProvider.Factory factory;
        fr.d0 d0Var3;
        String str2;
        Exception exc;
        d0 d0Var4;
        RegionUrlProvider regionUrlProvider4;
        String str3;
        Object nextBestRegionUrl;
        d0 d0Var5;
        NetworkCallbackManager networkCallbackManager;
        LocalAudioTrack orCreateDefaultAudioTrack;
        Object publishAudioTrack$default;
        RegionUrlProvider regionUrlProvider5;
        LocalVideoTrack orCreateDefaultVideoTrack;
        Object publishVideoTrack$default;
        fr.d0 d0Var6;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            LocalVideoTrack localVideoTrack = (LocalVideoTrack) this.L$0;
                            a.g(obj);
                            orCreateDefaultVideoTrack = localVideoTrack;
                            publishVideoTrack$default = obj;
                            if (!((Boolean) publishVideoTrack$default).booleanValue()) {
                                orCreateDefaultVideoTrack.stopCapture();
                                orCreateDefaultVideoTrack.stop();
                            }
                            d0Var6 = this.this$0.coroutineScope;
                            if (d0Var6 == null) {
                                g0.D(d0Var6, null, null, new AnonymousClass3(this.this$0, null), 3);
                                return z.f31622a;
                            }
                            m.i("coroutineScope");
                            throw null;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    LocalAudioTrack localAudioTrack = (LocalAudioTrack) this.L$1;
                    fr.d0 d0Var7 = (fr.d0) this.L$0;
                    a.g(obj);
                    d0Var = d0Var7;
                    orCreateDefaultAudioTrack = localAudioTrack;
                    publishAudioTrack$default = obj;
                    if (!((Boolean) publishAudioTrack$default).booleanValue()) {
                        orCreateDefaultAudioTrack.stop();
                        orCreateDefaultAudioTrack.stopPrewarm();
                    }
                    g0.o(d0Var);
                    if (this.$options.getVideo()) {
                        orCreateDefaultVideoTrack = this.this$0.getLocalParticipant().getOrCreateDefaultVideoTrack();
                        orCreateDefaultVideoTrack.startCapture();
                        LocalParticipant localParticipant = this.this$0.getLocalParticipant();
                        this.L$0 = orCreateDefaultVideoTrack;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        publishVideoTrack$default = LocalParticipant.publishVideoTrack$default(localParticipant, orCreateDefaultVideoTrack, null, null, this, 6, null);
                    }
                    d0Var6 = this.this$0.coroutineScope;
                    if (d0Var6 == null) {
                    }
                } else {
                    d0Var4 = (d0) this.L$4;
                    exc = (Exception) this.L$3;
                    str2 = (String) this.L$2;
                    d0 d0Var8 = (d0) this.L$1;
                    fr.d0 d0Var9 = (fr.d0) this.L$0;
                    a.g(obj);
                    d0Var = d0Var9;
                    d0Var5 = d0Var8;
                    nextBestRegionUrl = obj;
                    str3 = (String) nextBestRegionUrl;
                    d0Var2 = d0Var5;
                    d0Var4.f20559a = str3;
                    if (d0Var2.f20559a != null) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            StringBuilder r10 = f.r("Connection to ", str2, " failed, retrying with another region: ");
                            r10.append((String) d0Var2.f20559a);
                            d.a(exc, r10.toString(), new Object[0]);
                        }
                    } else {
                        throw exc;
                    }
                }
            } else {
                String str4 = (String) this.L$2;
                d0 d0Var10 = (d0) this.L$1;
                fr.d0 d0Var11 = (fr.d0) this.L$0;
                try {
                    a.g(obj);
                    d0Var2 = d0Var10;
                    d0Var = d0Var11;
                } catch (Exception e10) {
                    exc = e10;
                    d0Var4 = d0Var10;
                    str2 = str4;
                    d0Var3 = d0Var11;
                    if (exc instanceof CancellationException) {
                        regionUrlProvider4 = this.this$0.regionUrlProvider;
                        if (regionUrlProvider4 != null) {
                            this.L$0 = d0Var3;
                            this.L$1 = d0Var4;
                            this.L$2 = str2;
                            this.L$3 = exc;
                            this.L$4 = d0Var4;
                            this.label = 2;
                            nextBestRegionUrl = regionUrlProvider4.getNextBestRegionUrl(this);
                            if (nextBestRegionUrl != aVar) {
                                d0Var = d0Var3;
                                d0Var5 = d0Var4;
                                str3 = (String) nextBestRegionUrl;
                                d0Var2 = d0Var5;
                                d0Var4.f20559a = str3;
                                if (d0Var2.f20559a != null) {
                                }
                            }
                            return aVar;
                        }
                        d0Var2 = d0Var4;
                        d0Var = d0Var3;
                        str3 = null;
                        d0Var4.f20559a = str3;
                        if (d0Var2.f20559a != null) {
                        }
                    } else {
                        throw exc;
                    }
                }
            }
        } else {
            a.g(obj);
            fr.d0 d0Var12 = (fr.d0) this.L$0;
            if (this.this$0.getAudioProcessingController() instanceof AuthedAudioProcessingController) {
                ((AuthedAudioProcessingController) this.this$0.getAudioProcessingController()).authenticate(this.$url, this.$token);
            }
            regionUrlProvider = this.this$0.regionUrlProvider;
            if (regionUrlProvider != null) {
                uri = regionUrlProvider.getServerUrl();
            } else {
                uri = null;
            }
            if (!String.valueOf(uri).equals(this.$url)) {
                this.this$0.regionUrl = null;
                this.this$0.regionUrlProvider = null;
            }
            URI uri2 = new URI(this.$url);
            if (RegionUrlProviderKt.isLKCloud(uri2)) {
                regionUrlProvider2 = this.this$0.regionUrlProvider;
                Room room = this.this$0;
                if (regionUrlProvider2 == null) {
                    factory = room.regionUrlProviderFactory;
                    room.regionUrlProvider = factory.create(uri2, this.$token);
                } else {
                    regionUrlProvider3 = room.regionUrlProvider;
                    if (regionUrlProvider3 != null) {
                        regionUrlProvider3.setToken(this.$token);
                    }
                }
                g0.D(d0Var12, null, null, new AnonymousClass1(this.this$0, null), 3);
            }
            ?? obj2 = new Object();
            str = this.this$0.regionUrl;
            if (str == null) {
                str = this.$url;
            }
            obj2.f20559a = str;
            this.this$0.regionUrl = null;
            d0Var = d0Var12;
            d0Var2 = obj2;
        }
        while (true) {
            Object obj3 = d0Var2.f20559a;
            if (obj3 != null) {
                String str5 = (String) obj3;
                d0Var2.f20559a = null;
                try {
                } catch (Exception e11) {
                    str2 = str5;
                    d0Var3 = d0Var;
                    exc = e11;
                    d0Var4 = d0Var2;
                    if (exc instanceof CancellationException) {
                    }
                }
                RTCEngine engine = this.this$0.getEngine();
                regionUrlProvider5 = this.this$0.regionUrlProvider;
                engine.setRegionUrlProvider$livekit_android_sdk_release(regionUrlProvider5);
                RTCEngine engine2 = this.this$0.getEngine();
                String str6 = this.$token;
                ConnectOptions connectOptions = this.$options;
                RoomOptions roomOptions = (RoomOptions) this.$roomOptions.f20559a;
                this.L$0 = d0Var;
                this.L$1 = d0Var2;
                this.L$2 = str5;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                if (engine2.join(str5, str6, connectOptions, roomOptions, this) == aVar) {
                    break;
                }
            } else {
                g0.o(d0Var);
                networkCallbackManager = this.this$0.networkCallbackManager;
                networkCallbackManager.registerCallback();
                if (this.$options.getAudio()) {
                    orCreateDefaultAudioTrack = this.this$0.getLocalParticipant().getOrCreateDefaultAudioTrack();
                    orCreateDefaultAudioTrack.prewarm();
                    LocalParticipant localParticipant2 = this.this$0.getLocalParticipant();
                    this.L$0 = d0Var;
                    this.L$1 = orCreateDefaultAudioTrack;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    publishAudioTrack$default = LocalParticipant.publishAudioTrack$default(localParticipant2, orCreateDefaultAudioTrack, null, null, this, 6, null);
                }
            }
        }
        return aVar;
    }
}
