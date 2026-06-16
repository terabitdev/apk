package io.elevenlabs.readerapp;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.x;
import androidx.lifecycle.z0;
import io.elevenlabs.di.WorkerEntryPoint;
import io.elevenlabs.player.BackgroundPlayerService_GeneratedInjector;
import io.elevenlabs.readerapp.services.NotificationRetrievalService_GeneratedInjector;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReaderApp_HiltComponents {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ActivityC implements ml.a, pl.a, pl.g, tl.a, MainActivity_GeneratedInjector {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.a {
            @Override // ol.a
            /* synthetic */ ol.a activity(Activity activity);

            @Override // ol.a
            /* synthetic */ ml.a build();
        }

        public abstract /* synthetic */ ol.c fragmentComponentBuilder();

        public abstract /* synthetic */ pl.b getHiltInternalFactoryFactory();

        public abstract /* synthetic */ ol.e viewComponentBuilder();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ActivityCBuilderModule {
        ol.a bind(ActivityC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ActivityRetainedC implements ml.b, ql.a, ql.e, tl.a {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.b {
            @Override // ol.b
            /* synthetic */ ml.b build();

            @Override // ol.b
            /* synthetic */ ol.b savedStateHandleHolder(ql.i iVar);
        }

        public abstract /* synthetic */ ol.a activityComponentBuilder();

        public abstract /* synthetic */ ll.a getActivityRetainedLifecycle();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ActivityRetainedCBuilderModule {
        ol.b bind(ActivityRetainedC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class FragmentC implements ml.c, tl.a {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.c {
            /* synthetic */ ml.c build();

            /* synthetic */ ol.c fragment(x xVar);
        }

        public abstract /* synthetic */ pl.b getHiltInternalFactoryFactory();

        public abstract /* synthetic */ ol.g viewWithFragmentComponentBuilder();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface FragmentCBuilderModule {
        ol.c bind(FragmentC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ServiceC implements ml.d, tl.a, BackgroundPlayerService_GeneratedInjector, NotificationRetrievalService_GeneratedInjector {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.d {
            @Override // ol.d
            /* synthetic */ ml.d build();

            @Override // ol.d
            /* synthetic */ ol.d service(Service service);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ServiceCBuilderModule {
        ol.d bind(ServiceC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class SingletonC implements ql.c, ql.j, tl.a, WorkerEntryPoint, ReaderApp_GeneratedInjector {
        public abstract /* synthetic */ Set getDisableFragmentGetContextFix();

        @Override // ql.c
        public abstract /* synthetic */ ol.b retainedComponentBuilder();

        public abstract /* synthetic */ ol.d serviceComponentBuilder();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ViewC implements ml.e, tl.a {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.e {
            /* synthetic */ ml.e build();

            /* synthetic */ ol.e view(View view);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ViewCBuilderModule {
        ol.e bind(ViewC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ViewModelC implements ml.f, pl.e, tl.a {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.f {
            @Override // ol.f
            /* synthetic */ ml.f build();

            @Override // ol.f
            /* synthetic */ ol.f savedStateHandle(z0 z0Var);

            @Override // ol.f
            /* synthetic */ ol.f viewModelLifecycle(ll.b bVar);
        }

        public abstract /* synthetic */ Map getHiltViewModelAssistedMap();

        public abstract /* synthetic */ Map getHiltViewModelMap();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ViewModelCBuilderModule {
        ol.f bind(ViewModelC.Builder builder);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static abstract class ViewWithFragmentC implements ml.g, tl.a {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public interface Builder extends ol.g {
            /* synthetic */ ml.g build();

            /* synthetic */ ol.g view(View view);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public interface ViewWithFragmentCBuilderModule {
        ol.g bind(ViewWithFragmentC.Builder builder);
    }

    private ReaderApp_HiltComponents() {
    }
}
