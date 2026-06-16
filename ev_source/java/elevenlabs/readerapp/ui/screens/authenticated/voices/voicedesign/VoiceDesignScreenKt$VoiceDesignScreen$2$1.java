package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign;

import com.google.protobuf.c6;
import fr.d0;
import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt$VoiceDesignScreen$2$1", f = "VoiceDesignScreen.kt", l = {60}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class VoiceDesignScreenKt$VoiceDesignScreen$2$1 extends yn.i implements p {
    final /* synthetic */ ho.a $onGoBack;
    final /* synthetic */ ho.a $onNavigateToPaywall;
    final /* synthetic */ l $onVoiceCreated;
    final /* synthetic */ VoiceDesignViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDesignScreenKt$VoiceDesignScreen$2$1(VoiceDesignViewModel voiceDesignViewModel, ho.a aVar, l lVar, ho.a aVar2, wn.c<? super VoiceDesignScreenKt$VoiceDesignScreen$2$1> cVar) {
        super(2, cVar);
        this.$viewModel = voiceDesignViewModel;
        this.$onGoBack = aVar;
        this.$onVoiceCreated = lVar;
        this.$onNavigateToPaywall = aVar2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoiceDesignScreenKt$VoiceDesignScreen$2$1(this.$viewModel, this.$onGoBack, this.$onVoiceCreated, this.$onNavigateToPaywall, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VoiceDesignScreenKt$VoiceDesignScreen$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            ir.i effectsFlow = this.$viewModel.getEffectsFlow();
            final ho.a aVar = this.$onGoBack;
            final l lVar = this.$onVoiceCreated;
            final ho.a aVar2 = this.$onNavigateToPaywall;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt$VoiceDesignScreen$2$1.1
                public final Object emit(VoiceDesignContract.Effect effect, wn.c<? super z> cVar) {
                    if (effect instanceof VoiceDesignContract.Effect.CloseSheet) {
                        ho.a.this.invoke();
                    } else if (effect instanceof VoiceDesignContract.Effect.VoiceCreated) {
                        lVar.invoke(((VoiceDesignContract.Effect.VoiceCreated) effect).getVoiceId());
                    } else if (effect instanceof VoiceDesignContract.Effect.NavigateToPaywall) {
                        aVar2.invoke();
                    } else {
                        c6.p();
                        return null;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((VoiceDesignContract.Effect) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = effectsFlow.collect(jVar, this);
            xn.a aVar3 = xn.a.f37986a;
            if (collect == aVar3) {
                return aVar3;
            }
        }
        return z.f31622a;
    }
}
