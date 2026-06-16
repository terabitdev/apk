package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AuthorService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$onFollowToggle$1$1", f = "AuthorProfileScreen.kt", l = {260, 262}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AuthorProfileViewModel$onFollowToggle$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $authorId;
    final /* synthetic */ boolean $isCurrentlyFollowing;
    int label;
    final /* synthetic */ AuthorProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorProfileViewModel$onFollowToggle$1$1(boolean z6, AuthorProfileViewModel authorProfileViewModel, String str, wn.c<? super AuthorProfileViewModel$onFollowToggle$1$1> cVar) {
        super(2, cVar);
        this.$isCurrentlyFollowing = z6;
        this.this$0 = authorProfileViewModel;
        this.$authorId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthorProfileViewModel$onFollowToggle$1$1(this.$isCurrentlyFollowing, this.this$0, this.$authorId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthorProfileViewModel$onFollowToggle$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r5 == r3) goto L18;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthorService authorService;
        AuthorService authorService2;
        AsyncCallResult asyncCallResult;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    asyncCallResult = (AsyncCallResult) obj;
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                asyncCallResult = (AsyncCallResult) obj;
            }
        } else {
            sn.a.g(obj);
            boolean z6 = this.$isCurrentlyFollowing;
            AuthorProfileViewModel authorProfileViewModel = this.this$0;
            xn.a aVar = xn.a.f37986a;
            if (z6) {
                authorService2 = authorProfileViewModel.authorService;
                String str = this.$authorId;
                this.label = 1;
                obj = authorService2.unfollowAuthor(str, this);
            } else {
                authorService = authorProfileViewModel.authorService;
                String str2 = this.$authorId;
                this.label = 2;
                obj = authorService.followAuthor(str2, this);
            }
            return aVar;
        }
        this.this$0.handleFollowResult(asyncCallResult, this.$isCurrentlyFollowing);
        return z.f31622a;
    }
}
