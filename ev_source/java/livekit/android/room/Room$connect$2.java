package io.livekit.android.room;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.a0;
import fr.d0;
import fr.d2;
import fr.g0;
import fr.k1;
import fr.t0;
import ho.l;
import ho.p;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.e2ee.E2EEManager;
import io.livekit.android.room.Room;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.Room$connect$2", f = "Room.kt", l = {1607, 433, 557}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Room$connect$2 extends i implements p {
    final /* synthetic */ ConnectOptions $options;
    final /* synthetic */ String $token;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ Room this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Room$connect$2(Room room, ConnectOptions connectOptions, String str, String str2, c<? super Room$connect$2> cVar) {
        super(2, cVar);
        this.this$0 = room;
        this.$options = connectOptions;
        this.$url = str;
        this.$token = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        Room$connect$2 room$connect$2 = new Room$connect$2(this.this$0, this.$options, this.$url, this.$token, cVar);
        room$connect$2.L$0 = obj;
        return room$connect$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c cVar) {
        return ((Room$connect$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0119 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #0 {all -> 0x00d6, blocks: (B:18:0x00e4, B:20:0x0119, B:35:0x0094, B:37:0x009c, B:39:0x00a2, B:41:0x00a8, B:43:0x00b6, B:47:0x00da, B:48:0x00dd, B:49:0x00de, B:50:0x00e1, B:52:0x01b0, B:53:0x01b5), top: B:34:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01aa A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object obj2;
        a aVar2;
        Room room;
        d0 d0Var;
        ConnectOptions connectOptions;
        a aVar3;
        d0 d0Var2;
        kotlin.jvm.internal.d0 d0Var3;
        d0 d0Var4;
        d0 d0Var5;
        d0 d0Var6;
        Room room2;
        Object obj3;
        d0 d0Var7;
        fr.z zVar;
        RoomOptions currentRoomOptions;
        d0 d0Var8;
        fr.z zVar2;
        kotlin.jvm.internal.d0 d0Var9;
        E2EEManager.Factory factory;
        Throwable th;
        int i10 = this.label;
        xn.a aVar4 = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            d0Var9 = (kotlin.jvm.internal.d0) this.L$0;
                            sn.a.g(obj);
                            th = (Throwable) d0Var9.f20559a;
                            if (th != null) {
                                return null;
                            }
                            throw th;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    connectOptions = (ConnectOptions) this.L$4;
                    room2 = (Room) this.L$3;
                    aVar3 = (a) this.L$2;
                    obj3 = (kotlin.jvm.internal.d0) this.L$1;
                    d0Var7 = (d0) this.L$0;
                    try {
                        sn.a.g(obj);
                        d0Var3 = obj3;
                        aVar2 = aVar3;
                        room = room2;
                        d0Var4 = d0Var7;
                        room.setState(Room.State.CONNECTING);
                        room.connectOptions = connectOptions;
                        zVar = room.defaultDispatcher;
                        room.coroutineScope = g0.c(zVar.plus(g0.f()));
                        currentRoomOptions = room.getCurrentRoomOptions();
                        d0Var3.f20559a = currentRoomOptions;
                        room.getLocalParticipant().reinitialize$livekit_android_sdk_release();
                        room.setupLocalParticipantEventHandling();
                        if (((RoomOptions) d0Var3.f20559a).getE2eeOptions() != null) {
                            factory = room.e2EEManagerFactory;
                            E2EEManager create = factory.create(((RoomOptions) d0Var3.f20559a).getE2eeOptions().getKeyProvider());
                            create.setup(room, new Room$connect$2$1$1$1(room));
                            room.setE2eeManager(create);
                            room.getEngine().setE2EEManager$livekit_android_sdk_release(room.getE2eeManager());
                        }
                        aVar2.n(null);
                        Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 = new Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1(a0.f9798a);
                        d0Var8 = this.this$0.coroutineScope;
                        if (d0Var8 != null) {
                            zVar2 = this.this$0.ioDispatcher;
                            d2 D = g0.D(d0Var8, zVar2.plus(room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1), null, new Room$connect$2$connectJob$1(this.this$0, this.$url, this.$token, this.$options, d0Var3, null), 2);
                            t0 invokeOnCompletion = g0.u(d0Var4.getCoroutineContext()).invokeOnCompletion(new Room$connect$2$outerHandler$1(D));
                            ?? obj4 = new Object();
                            D.invokeOnCompletion(new AnonymousClass2(invokeOnCompletion, obj4));
                            this.L$0 = obj4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.label = 3;
                            if (D.join(this) != aVar4) {
                                d0Var9 = obj4;
                                th = (Throwable) d0Var9.f20559a;
                                if (th != null) {
                                }
                            }
                            return aVar4;
                        }
                        m.i("coroutineScope");
                        throw null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3.n(null);
                        throw th;
                    }
                }
                connectOptions = (ConnectOptions) this.L$4;
                room = (Room) this.L$3;
                aVar2 = (a) this.L$2;
                obj2 = (kotlin.jvm.internal.d0) this.L$1;
                d0Var = (d0) this.L$0;
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                d0 d0Var10 = (d0) this.L$0;
                if (this.this$0.getState() == Room.State.DISCONNECTED) {
                    Object obj5 = new Object();
                    aVar = this.this$0.stateLock;
                    Room room3 = this.this$0;
                    ConnectOptions connectOptions2 = this.$options;
                    this.L$0 = d0Var10;
                    this.L$1 = obj5;
                    this.L$2 = aVar;
                    this.L$3 = room3;
                    this.L$4 = connectOptions2;
                    this.label = 1;
                    if (aVar.a(this) != aVar4) {
                        obj2 = obj5;
                        aVar2 = aVar;
                        room = room3;
                        d0Var = d0Var10;
                        connectOptions = connectOptions2;
                    }
                    return aVar4;
                }
                c6.x("Room.connect attempted while room is not disconnected!");
                return null;
            }
            if (room.getState() == Room.State.DISCONNECTED) {
                d0Var2 = room.coroutineScope;
                if (d0Var2 != null) {
                    d0Var5 = room.coroutineScope;
                    if (d0Var5 != null) {
                        k1 u6 = g0.u(d0Var5.getCoroutineContext());
                        d0Var6 = room.coroutineScope;
                        if (d0Var6 != null) {
                            g0.i(d0Var6, null);
                            this.L$0 = d0Var;
                            this.L$1 = obj2;
                            this.L$2 = aVar2;
                            this.L$3 = room;
                            this.L$4 = connectOptions;
                            this.label = 2;
                            if (u6.join(this) != aVar4) {
                                room2 = room;
                                aVar3 = aVar2;
                                obj3 = obj2;
                                d0Var7 = d0Var;
                                d0Var3 = obj3;
                                aVar2 = aVar3;
                                room = room2;
                                d0Var4 = d0Var7;
                                room.setState(Room.State.CONNECTING);
                                room.connectOptions = connectOptions;
                                zVar = room.defaultDispatcher;
                                room.coroutineScope = g0.c(zVar.plus(g0.f()));
                                currentRoomOptions = room.getCurrentRoomOptions();
                                d0Var3.f20559a = currentRoomOptions;
                                room.getLocalParticipant().reinitialize$livekit_android_sdk_release();
                                room.setupLocalParticipantEventHandling();
                                if (((RoomOptions) d0Var3.f20559a).getE2eeOptions() != null) {
                                }
                                aVar2.n(null);
                                Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$12 = new Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1(a0.f9798a);
                                d0Var8 = this.this$0.coroutineScope;
                                if (d0Var8 != null) {
                                }
                            } else {
                                return aVar4;
                            }
                        } else {
                            m.i("coroutineScope");
                            throw null;
                        }
                    } else {
                        m.i("coroutineScope");
                        throw null;
                    }
                } else {
                    d0Var3 = obj2;
                    d0Var4 = d0Var;
                    room.setState(Room.State.CONNECTING);
                    room.connectOptions = connectOptions;
                    zVar = room.defaultDispatcher;
                    room.coroutineScope = g0.c(zVar.plus(g0.f()));
                    currentRoomOptions = room.getCurrentRoomOptions();
                    d0Var3.f20559a = currentRoomOptions;
                    room.getLocalParticipant().reinitialize$livekit_android_sdk_release();
                    room.setupLocalParticipantEventHandling();
                    if (((RoomOptions) d0Var3.f20559a).getE2eeOptions() != null) {
                    }
                    aVar2.n(null);
                    Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1 room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$122 = new Room$connect$2$invokeSuspend$$inlined$CoroutineExceptionHandler$1(a0.f9798a);
                    d0Var8 = this.this$0.coroutineScope;
                    if (d0Var8 != null) {
                    }
                }
            } else {
                throw new IllegalStateException("Room.connect attempted while room is not disconnected!");
            }
        } catch (Throwable th3) {
            th = th3;
            aVar3 = aVar2;
            aVar3.n(null);
            throw th;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ParameterNames.CAUSE, "Lsn/z;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.Room$connect$2$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends n implements l {
        final /* synthetic */ kotlin.jvm.internal.d0 $error;
        final /* synthetic */ t0 $outerHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(t0 t0Var, kotlin.jvm.internal.d0 d0Var) {
            super(1);
            this.$outerHandler = t0Var;
            this.$error = d0Var;
        }

        public final void invoke(Throwable th) {
            this.$outerHandler.dispose();
            this.$error.f20559a = th;
        }

        @Override // ho.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return z.f31622a;
        }
    }
}
