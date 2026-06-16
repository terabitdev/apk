package io.elevenlabs.analytics;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.services.FeatureFlagService;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.analytics.PostHogFeatureFlagService$isFlagEnabled$2", f = "PostHogFeatureFlagService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lsn/z;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class PostHogFeatureFlagService$isFlagEnabled$2 extends i implements p {
    final /* synthetic */ boolean $defaultValue;
    final /* synthetic */ FeatureFlagService.Flag $flag;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ PostHogFeatureFlagService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostHogFeatureFlagService$isFlagEnabled$2(PostHogFeatureFlagService postHogFeatureFlagService, FeatureFlagService.Flag flag, boolean z6, c<? super PostHogFeatureFlagService$isFlagEnabled$2> cVar) {
        super(2, cVar);
        this.this$0 = postHogFeatureFlagService;
        this.$flag = flag;
        this.$defaultValue = z6;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        PostHogFeatureFlagService$isFlagEnabled$2 postHogFeatureFlagService$isFlagEnabled$2 = new PostHogFeatureFlagService$isFlagEnabled$2(this.this$0, this.$flag, this.$defaultValue, cVar);
        postHogFeatureFlagService$isFlagEnabled$2.Z$0 = ((Boolean) obj).booleanValue();
        return postHogFeatureFlagService$isFlagEnabled$2;
    }

    public final Object invoke(boolean z6, c<? super z> cVar) {
        return ((PostHogFeatureFlagService$isFlagEnabled$2) create(Boolean.valueOf(z6), cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean z6 = this.Z$0;
        if (this.label == 0) {
            sn.a.g(obj);
            this.this$0.logger.log("PostHogFeatureFlagService", "Feature flag: " + this.$flag.getKey() + " is enabled: " + z6 + " (default=" + this.$defaultValue + Separators.RPAREN);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (c<? super z>) obj2);
    }
}
