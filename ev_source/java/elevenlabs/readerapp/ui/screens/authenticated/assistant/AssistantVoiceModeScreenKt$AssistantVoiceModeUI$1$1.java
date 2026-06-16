package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import com.google.api.Endpoint;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.livekit.android.room.SignalClient;
import j1.a2;
import j1.e0;
import j1.r0;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1", f = "AssistantVoiceModeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1 extends yn.i implements ho.p {
    final /* synthetic */ j1.d $animatedOpacity;
    final /* synthetic */ j1.d $animatedScale;
    final /* synthetic */ boolean $isLoading;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$1", f = "AssistantVoiceModeScreen.kt", l = {88}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ j1.d $animatedScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j1.d dVar, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$animatedScale = dVar;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$animatedScale, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                j1.d dVar = this.$animatedScale;
                Float f10 = new Float(0.9f);
                e0 p10 = j1.e.p(j1.e.s(SignalClient.CLOSE_REASON_NORMAL_CLOSURE, 0, j1.y.f18444a, 2), r0.f18351b, 0L, 4);
                this.label = 1;
                Object c5 = j1.d.c(dVar, f10, p10, null, this, 12);
                xn.a aVar = xn.a.f37986a;
                if (c5 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$2", f = "AssistantVoiceModeScreen.kt", l = {100}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        final /* synthetic */ j1.d $animatedOpacity;
        final /* synthetic */ a2 $animationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j1.d dVar, a2 a2Var, wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$animatedOpacity = dVar;
            this.$animationSpec = a2Var;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(this.$animatedOpacity, this.$animationSpec, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                j1.d dVar = this.$animatedOpacity;
                Float f10 = new Float(1.0f);
                a2 a2Var = this.$animationSpec;
                this.label = 1;
                Object c5 = j1.d.c(dVar, f10, a2Var, null, this, 12);
                xn.a aVar = xn.a.f37986a;
                if (c5 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$3", f = "AssistantVoiceModeScreen.kt", l = {Endpoint.TARGET_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends yn.i implements ho.p {
        final /* synthetic */ j1.d $animatedScale;
        final /* synthetic */ a2 $animationSpec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(j1.d dVar, a2 a2Var, wn.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$animatedScale = dVar;
            this.$animationSpec = a2Var;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass3(this.$animatedScale, this.$animationSpec, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass3) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                j1.d dVar = this.$animatedScale;
                Float f10 = new Float(1.0f);
                a2 a2Var = this.$animationSpec;
                this.label = 1;
                Object c5 = j1.d.c(dVar, f10, a2Var, null, this, 12);
                xn.a aVar = xn.a.f37986a;
                if (c5 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1(boolean z6, j1.d dVar, j1.d dVar2, wn.c<? super AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1> cVar) {
        super(2, cVar);
        this.$isLoading = z6;
        this.$animatedScale = dVar;
        this.$animatedOpacity = dVar2;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1 assistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1 = new AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1(this.$isLoading, this.$animatedScale, this.$animatedOpacity, cVar);
        assistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1.L$0 = obj;
        return assistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AssistantVoiceModeScreenKt$AssistantVoiceModeUI$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var = (d0) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            a2 s10 = j1.e.s(400, 0, j1.y.f18444a, 2);
            if (this.$isLoading) {
                g0.D(d0Var, null, null, new AnonymousClass1(this.$animatedScale, null), 3);
            } else {
                g0.D(d0Var, null, null, new AnonymousClass2(this.$animatedOpacity, s10, null), 3);
                g0.D(d0Var, null, null, new AnonymousClass3(this.$animatedScale, s10, null), 3);
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
