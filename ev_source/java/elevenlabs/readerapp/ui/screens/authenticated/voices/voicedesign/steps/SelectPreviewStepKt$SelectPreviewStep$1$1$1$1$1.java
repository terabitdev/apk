package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import ir.r;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import u2.f1;
import w1.e0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1", f = "SelectPreviewStep.kt", l = {92}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1 extends yn.i implements p {
    final /* synthetic */ ho.l $onEvent;
    final /* synthetic */ e0 $pagerState;
    final /* synthetic */ List<VoiceDesignContract.PreviewItem> $previews;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1(e0 e0Var, ho.l lVar, List<VoiceDesignContract.PreviewItem> list, wn.c<? super SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1> cVar) {
        super(2, cVar);
        this.$pagerState = e0Var;
        this.$onEvent = lVar;
        this.$previews = list;
    }

    public static final int invokeSuspend$lambda$0(e0 e0Var) {
        return ((f1) e0Var.f35962d.f5294c).h();
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1(this.$pagerState, this.$onEvent, this.$previews, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            ir.i o6 = r.o(u2.r.K(new k(this.$pagerState, 0)));
            AnonymousClass2 anonymousClass2 = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1.2
                final /* synthetic */ List<VoiceDesignContract.PreviewItem> $previews;

                public AnonymousClass2(List<VoiceDesignContract.PreviewItem> list) {
                    r2 = list;
                }

                public final Object emit(int i11, wn.c<? super z> cVar) {
                    ho.l.this.invoke(new VoiceDesignContract.Event.UpdatePreviewIndex(i11));
                    VoiceDesignContract.PreviewItem previewItem = (VoiceDesignContract.PreviewItem) o.z0(i11, r2);
                    if (previewItem != null) {
                        ho.l.this.invoke(new VoiceDesignContract.Event.PlayPreview(previewItem.getGeneratedVoiceId()));
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit(((Number) obj2).intValue(), (wn.c<? super z>) cVar);
                }
            };
            this.label = 1;
            Object collect = o6.collect(anonymousClass2, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2<T> implements ir.j {
        final /* synthetic */ List<VoiceDesignContract.PreviewItem> $previews;

        public AnonymousClass2(List<VoiceDesignContract.PreviewItem> list) {
            r2 = list;
        }

        public final Object emit(int i11, wn.c<? super z> cVar) {
            ho.l.this.invoke(new VoiceDesignContract.Event.UpdatePreviewIndex(i11));
            VoiceDesignContract.PreviewItem previewItem = (VoiceDesignContract.PreviewItem) o.z0(i11, r2);
            if (previewItem != null) {
                ho.l.this.invoke(new VoiceDesignContract.Event.PlayPreview(previewItem.getGeneratedVoiceId()));
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
            return emit(((Number) obj2).intValue(), (wn.c<? super z>) cVar);
        }
    }
}
