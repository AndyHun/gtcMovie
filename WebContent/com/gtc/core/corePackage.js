define([ 'core/model/Config', 'core/model/Session', 'core/util/ObjectUtil',
		'core/util/StringUtil', 'core/view/View','core/view/Panel' ], function(Config, Session,
		ObjectUtil, StringUtil, View, Panel) {
	return {
		Config : Config,
		Session : Session,
		ObjectUtil : ObjectUtil,
		StringUtil : StringUtil,
		View : View,
		Panel : Panel
	};
});