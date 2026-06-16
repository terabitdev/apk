package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.services.AuthorService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$doInit$2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$doInit$2", f = "AuthorProfileScreen.kt", l = {143, 143}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AuthorProfileViewModel$doInit$2 extends yn.i implements ho.p {
    final /* synthetic */ String $authorId;
    int label;
    final /* synthetic */ AuthorProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorProfileViewModel$doInit$2(AuthorProfileViewModel authorProfileViewModel, String str, wn.c<? super AuthorProfileViewModel$doInit$2> cVar) {
        super(2, cVar);
        this.this$0 = authorProfileViewModel;
        this.$authorId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthorProfileViewModel$doInit$2(this.this$0, this.$authorId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthorProfileViewModel$doInit$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (((ir.i) r6).collect(r0, r5) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AuthorService authorService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            authorService = this.this$0.authorService;
            String str = this.$authorId;
            this.label = 1;
            obj = authorService.getAuthorProfile(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$authorId);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel$doInit$2$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ String $authorId;
        final /* synthetic */ AuthorProfileViewModel this$0;

        public AnonymousClass1(AuthorProfileViewModel authorProfileViewModel, String str) {
            this.this$0 = authorProfileViewModel;
            this.$authorId = str;
        }

        public static final AuthorProfileState emit$lambda$2(AuthorProfile authorProfile, SelectedSubpage selectedSubpage, Map map, AuthorProfileState authorProfileState) {
            authorProfileState.getClass();
            return AuthorProfileState.copy$default(authorProfileState, null, authorProfile, false, false, null, selectedSubpage, map, 9, null);
        }

        public static final AuthorProfileState emit$lambda$3(String str, AuthorProfileState authorProfileState) {
            authorProfileState.getClass();
            return AuthorProfileState.copy$default(authorProfileState, null, null, false, false, str, null, null, 105, null);
        }

        public final Object emit(AsyncCallResult<AuthorProfile> asyncCallResult, wn.c<? super z> cVar) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            String str;
            ir.i iVar;
            final SelectedSubpage selectedSubpage = null;
            if (asyncCallResult instanceof AsyncCallResult.Success) {
                final AuthorProfile authorProfile = (AuthorProfile) ((AsyncCallResult.Success) asyncCallResult).getData();
                AuthorProfilePage authorProfilePage = (AuthorProfilePage) tn.o.y0(authorProfile.getPages());
                if (authorProfilePage != null) {
                    str = authorProfilePage.getId();
                } else {
                    str = null;
                }
                List<AuthorProfilePage> pages = authorProfile.getPages();
                int H = a0.H(tn.p.a0(pages, 10));
                if (H < 16) {
                    H = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                for (AuthorProfilePage authorProfilePage2 : pages) {
                    String id2 = authorProfilePage2.getId();
                    String defaultSort = authorProfilePage2.getDefaultSort();
                    if (defaultSort == null) {
                        defaultSort = "";
                    }
                    linkedHashMap.put(id2, defaultSort);
                }
                if (str != null) {
                    selectedSubpage = new SelectedSubpage(str, 0);
                }
                this.this$0.queueStateUpdate(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.m
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        AuthorProfileState emit$lambda$2;
                        emit$lambda$2 = AuthorProfileViewModel$doInit$2.AnonymousClass1.emit$lambda$2(AuthorProfile.this, selectedSubpage, linkedHashMap, (AuthorProfileState) obj);
                        return emit$lambda$2;
                    }
                });
                if (str != null) {
                    iVar = this.this$0._subpagePagingData;
                    if (iVar == null) {
                        AuthorProfileViewModel.initSubpagePagingData$default(this.this$0, this.$authorId, str, null, 4, null);
                    }
                }
            } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                this.this$0.queueStateUpdate(new n(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 0));
            } else {
                c6.p();
                return null;
            }
            return z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<AuthorProfile>) obj, (wn.c<? super z>) cVar);
        }
    }
}
